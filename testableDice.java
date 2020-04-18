import edu.princeton.cs.introcs.StdOut;

public class testableDice {
	private int lastRoll;
	private testableDie die1;
	private testableDie die2;

	// Constructors (object initializers) also can be declared anywhere
	// Convention: after instance fields/variables

	public testableDice()
	{
		// initialize instance variables die1 and die2 by
		// creating a new instance of each

		this.die1 = new testableDie();
		this.die2 = new testableDie();
		this.roll();
	}

	public testableDice(testableDie die1, testableDie die2) // overloaded constructor
	{
		this.die1 = die1;
		this.die2 = die2;
	}

	// Instance methods can also be declared anywhere in body of class
	// One convention: after the constructors

	public int getLastRoll()
	{
		return this.lastRoll;
	}

	public void roll()
	{
		// Roll each of die1, die2, sum their last rolls,
		// then set Dice.lastRoll to this value

		die1.roll();
		die2.roll();
		this.lastRoll = die1.getLastRoll() + die2.getLastRoll();

	}

	// the following method converts the internals of
	// this Dice object, and returns a descriptive String:
	//
	// Roll of 7 => 4 + 3
	//

	public String toString()
	{
		return "Dice with last roll: " + getLastRoll() + " => " + die1.getLastRoll() + " + " + die2.getLastRoll();
	}

	// static methods can go anywhere - but at end is one convention

	public static final int NUM_TRIALS = 360;

	public static void main(String[] args)
	{
		// simulate repeated rolls of Dice, counting the many double skunks
		
		Dice dice = new Dice();
		int doubleSkunkCount = 0;

		for (int i = 0; i < NUM_TRIALS; i++)
		{
			dice.roll();
			StdOut.println(dice);

			if (dice.getLastRoll() == 2)
				doubleSkunkCount++;
		}

		StdOut.println("Actual count: " + doubleSkunkCount);
		StdOut.println("Expected count: " + (NUM_TRIALS / 36.0));
	}
}
