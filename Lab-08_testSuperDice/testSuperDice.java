/**
 * testSuperDice.java, a program that tests the performance of superDie and superDice.
 *   
 * @author Matthew Scott Levan
 * @version 10/07/2014
 * @lab Eight 08 -- testSuperDice
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */
 
 public class testSuperDice {
	public static void main(String args[]) {
		int A[] = {6,20,4,8,12};
		superDice d1 = new superDice(A);			// Array of 5 superDie objects
		superDice d2 = new superDice(1,6);			// A single six-sided superDie
		superDice d3 = new superDice(3,6);			// Three six-sided superDie objects
		superDice d4 = new superDice(3,20);			// Three twenty-sided superDie objects
		
		System.out.println("TEST 1 AVERAGE: " + test(d1) + ".");
		System.out.println("TEST 2 AVERAGE: " + test(d2) + ".");
		System.out.println("TEST 3 AVERAGE: " + test(d3) + ".");
		System.out.println("TEST 4 AVERAGE: " + test(d4) + ".");
	}
	
	public static int test(superDice dice) {
		int sum = 0;
		for (int i = 0; i < 100; i++) {				// Roll 100 times and add each roll value to sum
			sum += dice.roll();
		}
		return (sum/100);							// Return the average of the sum of roll values
	}
 }