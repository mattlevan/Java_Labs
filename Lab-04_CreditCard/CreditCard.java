/**
 * CreditCard.java
 * 	A program that accepts an expense report text file, totals the costs 
 *  and reports the highest individual expense.
 *   
 * @author Matthew Scott Levan
 * @version 09/13/2014
 * @lab Four 04
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;


public class CreditCard {

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter the name of your text file, including the extension .txt: ");
		Scanner in = new Scanner(System.in);
		String filename = in.nextLine();			// Get filename from user
		DecimalFormat formatter = new DecimalFormat("###,###,###.00");
		File inputFile = new File(filename); 		// Create File object from <filename>.txt
		
		if ( !inputFile.exists()) {					// Ensure file exists
			System.out.println("File not found. Please try again.");
			System.exit(0);
		}
		
		double total = 0;
		double highest = 0; 	
		double cost = 0;
		int n;
		
		String price;
		String word;
		Scanner input = new Scanner(inputFile);		// Initialize new Scanner from File object above
		
		while (input.hasNext()) {					// While loop for iterating through file word-by-word	
			word = input.next();					// Advance to next word
					
			for (n = 0; n < word.length(); n++) { 	// For loop to iterate through word char-by-char
				if (word.charAt(n) == '$'){
					word = word.substring(1,word.length()); // Delete the $ so Double.parseDouble doesn't throw a NumberFormatException
					price = word;					// Give current word its own String variable
					cost = Double.parseDouble(price); // Set cost to the double parsed from String price
					
					if (cost > highest) {			// If current cost is higher than previous highest...
						highest = cost;				// Make the current cost the highest
					}
					
					total += cost;					// Add the current cost to the total
					break;							// Break out of for loop so each cost is counted only once
				}
				
				
				if (Character.isDigit(word.charAt(n))) {
					price = word;
					cost = Double.parseDouble(price);
					
					if (cost > highest) {
						highest = cost;
					}
					
					total += cost;
					break;
				}
			}
		}
		
		System.out.println("$" + formatter.format(highest) + " is the most expensive cost in this expense report. "
				+ "The total cost of all items in this file is $" + formatter.format(total) + ".");

	}

}
