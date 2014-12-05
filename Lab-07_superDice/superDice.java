/**
 * superDice.java, a program that defines a collection of  superDie  objects.
 *   
 * @author Matthew Scott Levan
 * @version 10/07/2014
 * @lab Seven 07 -- superDice
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */
 
import java.util.*; 							// for the Random class

public class superDice {
	private int num; 							// the number of dice in the array
	private superDie[] dice; 					// the array of superDie
	
	public superDice() { 						// default superDice constructor creates a single die with 6 sides
		dice = new superDie[1];
		dice[0] = new superDie();
	}

	public superDice(int val[]) { 				// one arg struct takes val[] and uses it for number of n sides on each of n dice
		dice = new superDie[val.length];
		
		for (int i = 0; i < val.length; i++) {
			dice[i] = new superDie(val[i]);
		}
	}
	 
	public superDice(int num, int sides) { 		// a two-argument constructor
		if (num > 0 && sides > 0) {
			dice = new superDie[num];
		
			for (int i = 0; i < num; i++) {
				dice[i] = new superDie(sides);
			}
		}
		else {
			System.out.println("Please enter valid integers (greater than 0).");
		}
	}
	 
	public int roll() { 						// roll all dice and return the sum
		int roll_value = 0;
		
		for (int i = 0; i < dice.length; i++) {
			roll_value += dice[i].roll();
		}
		
		return roll_value;
	}

	public int getNumDices() { 					// return the number of dice in the set
		int numDices = dice.length;
		
		return numDices;
	}

	public int getNumSide(int which) { 			// return the number of sides for a die
		int numSide;
		if (which >= 0 && which <= dice.length) {
			numSide = dice[which].getNumSide();
		}
		else {
			numSide = 0;
		}
		return numSide;
	}
	
	public void setSides(int which, int s) { 	// change the number of sides on a specific die
		if (which >= 0 && which <= dice.length) {
			dice[which] = new superDie(s);
		}
		else {
			System.out.println("Please enter a valid index.");
		}
		
	}
}
