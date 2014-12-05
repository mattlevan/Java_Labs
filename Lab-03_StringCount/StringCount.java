/**
 * stringCount.java
 * 	A program that accepts text from myfile.txt and counts its # of words, lines, and characters.
 *   
 * @author Matthew Scott Levan
 * @version 09/09/2014
 * @lab Three
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */

import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

public class StringCount {

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter the name of your text file, including the extension .txt: ");
		Scanner in = new Scanner(System.in);
		String filename = in.nextLine();	// Get filename from user
		
		File inputFile = new File(filename); // create File object from myfile.txt
		DecimalFormat formatter = new DecimalFormat("0.##");
		String line;						// to hold one full line from the file
		
		int n;								// loop counter
		
		int linecount = 0; 					// counter for lines
		int wordcount = 0; 					// counter for words
		int charcount = 0;					// counter for characters
		
		if ( !inputFile.exists()) {			// check file exists
			System.out.println("File not found. Please try again.");
			System.exit(0);
		}
		
		Scanner input = new Scanner(inputFile);	// initialize new Scanner from File object declared above

		while (input.hasNext()) {			// while loop for iterating through file line-by-line	
			line = input.nextLine();		// advance to next line, returns all "skipped" data
			System.out.println(line);		// print user's file text to screen one line at a time
			linecount++;			
			
			boolean sawword = false;		// boolean for switching on during iteration through letters
			
			for (n = 0; n < line.length(); n++) { // for loop to iterate through line char-by-char
				if (Character.isLetter(line.charAt(n))) {
					if(sawword == false) {	// i.e., "if last char was whitespace"
						wordcount++;		// once the loop hits a letter char, a new word is counted
						sawword = true;		// after reading the letter, switch is turned on until next whitespace
					}
				}
				
				if (Character.isWhitespace(line.charAt(n))) {
					sawword = false;		// switch sawword off once loop hits whitespace
				}
				
				charcount++;				// increment charcount for ever char
			}
		}

		System.out.println("\n*** END OF TEXT FILE ***\n");
		System.out.println("There are " + formatter.format(linecount) + " lines, "
		+ formatter.format(wordcount) + " words, and " + formatter.format(charcount)
		+ " characters in this file.");
		
		input.close();
	}
}
