/**
 * hasDup.java
 * 	A program that tests for duplicates in two integer arrays containing 10 elements each.
 *   
 * @author Matthew Scott Levan
 * @version 08/26/2014
 * @lab One
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */

public class HasDup {

	public static void main(String[] args) {
		// Declare two integer arrays called firstArray and secondArray
		int[] firstArray;
		int[] secondArray;
		
		// Allocate memory for 10 integer elements
		firstArray = new int[10];
		secondArray = new int[10];

		// Populate firstArray with all 0s using a for loop
		// Populate secondArray with integers equal to its indices using a for loop
		for (int i = 0; i < 10; i++) {
			firstArray[i] = 0;
			secondArray[i] = i;
		}
		
		// Test firstArray using testDup boolean method below
		if (testDup(firstArray) == true) {
			System.out.println("The first array has duplicates.");
		}
		else {
			System.out.println("The first array does not have duplicates.");
		}
		
		// Test secondArray using testDup boolean method below
		if (testDup(secondArray) == true) {
			System.out.println("The second array has duplicates.");
		}
		else {
			System.out.println("The second array does not have duplicates.");
		}
	}
	
	// testDup boolean method to test an integer array x for duplicates
	public static boolean testDup(int[] x) {
		// Initiate "for" loop that tests each element of the array against all others for equivalence 
		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (x[i] == x[j]) {
					return true;
				}
				else {
					continue;
				}
			}
		}
		return false; 
	}
	
}
