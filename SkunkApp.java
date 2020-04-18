import java.util.ArrayList;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SkunkApp {

	public static void main(String[] args) {  
		Dice dice1 = new Dice();
		
		Player player = new Player();
		
		int numberPlayers;
		String[] playerNames;
		ArrayList<Player> players;
		int kitty;
		Player activePlayer;
		int activePlayerIndex;
		playerNames = new String[50];
		players = new ArrayList<Player>();
		
		
		StdOut.println("Number of players in the game: ");
	    Scanner p = new Scanner(System.in);
	    numberPlayers = p.nextInt();
	    
	    for (int count = 0; count < numberPlayers; count++)
		{
	    	StdOut.println("Type name of player " + (count + 1) );
			playerNames[count] = StdIn.readLine();
			players.add(new Player());
		}
		activePlayerIndex = 0;
		activePlayer = players.get(activePlayerIndex);

		
		
//	    int count = 1;
//	    for (count=1; count<=numberPlayers; count++) {
//	    	StdOut.println("Type name of player " +count);
//			Scanner pl = new Scanner(System.in);
//			player.setName(pl.nextLine());
//	      
//	    }
	       
	    
	    StdOut.println("Would you like to know the rules?  (yes/no) ");
	    Scanner rules = new Scanner(System.in);
        String in = rules.nextLine();
	    if (in.equals("yes")) {
	    	StdOut.println("Rules: "
	    			+ "\nEvery player rolls dice twice per turn."
	    			+ "\nIf both rolls have the same value, the player scores twice the sum of the two dice rolls."
	    			+ "\nIf both rolls have different values, the player scores the sum of the rolls."
	    			+ "\nFor each player, the result is cummulated after each turn."
	    			+ "\nFirst player to reach or exceed 100 wins");
			}
		else if (in.equals("no")) {
			System.out.println("Then let's begin!");
			}	
		else {
				StdOut.println("Please type 'yes' or 'no' and hit enter");
		}
     ////////////
	    while(player.cummulativeScore <111) {
	    	
			if (player.cummulativeScore>=100) {
				StdOut.println("Winner winner we have a winner!!!!");
				StdOut.println("Congratulations " +playerNames[activePlayerIndex]);
				StdOut.println("Game over.");
				break;
			}
			else
			{
							
				StdOut.println(playerNames[activePlayerIndex]+ " " + ", will you roll? (yes/no)");
				
				Scanner scan = new Scanner(System.in);
		        String input = scan.nextLine();	
		        int turn = 0;
		        
				if (input.equals("yes")|| input.equals("y")) {
					dice1.roll();
					StdOut.println("Player " + playerNames[activePlayerIndex]+ " rolled "+ dice1.getLastRoll());
					StdOut.println(dice1.toString());
					int chips = 0;
					if (dice1.die1.getLastRoll() == 1 && dice1.die2.getLastRoll() == 1) {
						//if the 2 dice together = 2 then snake eyes
						player.cummulativeScore = 0;
						StdOut.println("Oh no!!! Double skunk thrown, lose all cummulative points.");
						StdOut.println("Current score: "+player.cummulativeScore);
						//add kitty arguments. must add 4 chips
//						chips += 4;
//						activePlayer.setChipTotal(activePlayer.getChipTotal() - 4);
//						StdOut.println("Penalty of 4 chips");
//						StdOut.println("Current chips: " +activePlayer.getChipTotal());
						activePlayer.totalChips+= -4;
						StdOut.println("Penalty of 4 chips");
						StdOut.println("Current Chips " +activePlayer.totalChips);
						
					}
					else if (dice1.getLastRoll() == 3) {
						turn= 0;
						StdOut.println("A deuce and a skunk thrown, no points. Try not to cry.");
						StdOut.println("Current score: "+player.cummulativeScore);
						//add kitty arguments. must add 2 chips.
						//chips += 2;
						activePlayer.totalChips+= -2;
						StdOut.println("Penalty of 2 chips");
						StdOut.println("Current Chips " +activePlayer.totalChips);
						
						//activePlayer.setChipTotal(activePlayer.getChipTotal() - 2);
						//StdOut.println("Penalty of 2 chips");
						//StdOut.println("Current chips: "+activePlayer.getChipTotal());
					}
					else if (dice1.die1.getLastRoll() == 1 || dice1.die2.getLastRoll() == 1) {
						turn= 0;
						StdOut.println("So sad. Skunk thrown, no points this turn. Count yourself lucky.");
						StdOut.println("Current score: "+player.cummulativeScore);
						//again, need another kitty argument, adds 1 chip
//						chips += 1;
//						activePlayer.setChipTotal(activePlayer.getChipTotal() - 1);
//						StdOut.println("Penalty of 1 chips");
//						StdOut.println("Current chips: "+activePlayer.getChipTotal());
						activePlayer.totalChips+= -1;
						StdOut.println("Penalty of 1 chips");
						StdOut.println("Current Chips " +activePlayer.totalChips);
					}
					else if (dice1.die1.getLastRoll()== dice1.die2.getLastRoll() && dice1.die1.getLastRoll() != 1) {
						turn = dice1.getLastRoll()*2;
						player.setTotalScore(turn);
						StdOut.println("Lucky you! Doubles means twice the points- Congrats");
						StdOut.println("Current score: "+player.cummulativeScore);
//						chips += 0;
//						activePlayer.setChipTotal(activePlayer.getChipTotal() - 0);
//						StdOut.println("Penalty of 0 chips");
//						StdOut.println("Current chips: "+activePlayer.getChipTotal());
						activePlayer.totalChips+= 0;
						StdOut.println("Penalty of 0 chips");
						StdOut.println("Current Chips " +activePlayer.totalChips);
					}
					else {
						turn = dice1.getLastRoll();
						player.setTotalScore(turn);
						StdOut.println("Nice work. Face value is added to your cummulative score.");
						StdOut.println("Current score: "+player.cummulativeScore);
//						chips += 0;
//						activePlayer.setChipTotal(activePlayer.getChipTotal() - 0);
//						StdOut.println("Penalty of 0 chips");
//						StdOut.println("Current chips: "+activePlayer.getChipTotal());
						activePlayer.totalChips+= 0;
						StdOut.println("Penalty of 0 chips");
						StdOut.println("Current Chips " +activePlayer.totalChips);
				}}
				else if (input.equals("no")||input.equals("n")) {
					System.out.println("Round complete");
					
					}	
				else {
					
						StdOut.println("Please type 'yes' or 'no' and hit enter");
					}
				StdOut.println("End of turn for " + playerNames[activePlayerIndex]);
				
				activePlayerIndex = (activePlayerIndex + 1) % numberPlayers;
				activePlayer = players.get(activePlayerIndex);
			}
			
	    }
		//as well as a final end-of-turn summary when the turn is over.  
		//Roll outcome reporting should include the name of the player, 
		//the value of each thrown die within a roll of the dice, 
		//what kind of Skunk is thrown (if any), 
		//and the current turn score thus accumulated for the player.  
		//The final end-of-turn summary should include the player's name, 
		//the complete sequence of roll outcomes during the turn, 
		//their final turn score, and how many chips they lost in the turn.
		
		
		//begins with the UI asking the player by name if they wish to roll 
		//and ends after either the user declines to roll again, 
		//or else throws a Skunk. 
		//Information should also be displayed about the outcome of each 
		//roll and the final outcome of the turn.
		

	}
}