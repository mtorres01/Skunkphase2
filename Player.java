import java.util.Scanner;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;


public class Player {	
	String name;	
	int totalChips = 50;
	int cummulativeScore;
	Scanner Input = new Scanner(System.in);
		
	
	public String getName() {
		return name;
	}	
	
	
	public void setName(String string) {
		this.name = string;
		
	
	}	
	
	int getTotalScore(){
        return cummulativeScore;
    }
	
	public void setTotalScore(int turn){
        cummulativeScore += turn;
    }
	
	
	int getChipTotal(){
        return totalChips;
    }
	
	public void setChipTotal(int chips){
        totalChips -= chips;
    }
	} 
