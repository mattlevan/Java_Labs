/** FormatExceptions.java, a program to count characters.
 *
 * @author Matthew Scott Levan 
 * @lab Lab 13 -- FormatExceptions
 * @professor Malcolm McCullough
 * @version 11/11/2014
 *
 */

import java.io.*;
import java.text.*;
import java.util.*;

public class FormatExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Please enter the name of the file which you'd like to have counted: ");
        Scanner input = new Scanner(System.in); // for getting filename from user
        String fileName = input.next(); // store the filename
        File file = new File(fileName); // instantiate new File object
        Scanner in = new Scanner(file); // Scanner for the file itself
        String line; // String variable to hold lines from the .txt file
        int counter = 0; // counter for counting chars

        while (in.hasNext()) { // while there's more data in the file
            line = in.nextLine().trim(); // get each line from file and trim away the leading/trailing whitespace
            for (int i = 0; i < line.length(); i++) { // iterate through each line, char-by-char
                char c = line.charAt(i); // store each char in the char variable "c"
                counter += charCount(c); // increment the counter using the return int from charCount()
            }
        }

        System.out.println("\nThis file contains " + counter + " alpha-numeric characters.\n");
    }

    public static int charCount(char c) {
        try {
            if (c == ' ') { // if char is whitespace, return 0
                return 0;
            }
            // if char is not ' ', a letter, or a digit, throw new Exception
            if (c != ' ' && Character.isLetter(c) == false && Character.isDigit(c) == false) {
                throw new Exception (c + " is not a letter or digit.");
            }
            return 1; // return 1 if Exception is not thrown
        }
        catch (Exception e) { // print the above statement if Exception is thrown and return 0
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
