import java.util.Scanner;

/**
 * factRecurs.java
 * 	A program that calculates the factorial of number n using recursion.
 *   
 * @author Matthew Scott Levan
 * @version 08/26/2014
 * @lab One
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */

public class FactRecurs {

	public static void main(String[] args) {
		int n, fact;
		
		System.out.println("This program computes the factorial of any positive number of your choice.");
		System.out.println("Enter a positive number: ");
		
			
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		fact = calcFact(n);
		
		System.out.println(n + "! = " + fact + ".");
	}
	
	static int calcFact(int n) {
		// Stop the loop so n is not multiplied by 0.
		if (n <= 1) {
			return 1;
		}
		// Call calcFact() within itself (recursion).
		else {
			return n * calcFact(n-1);
		}
	}
	

}
