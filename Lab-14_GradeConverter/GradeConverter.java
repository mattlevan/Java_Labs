/** GradeConverter.java, a program to convert a number 0-100 to a letter grade A-F and throw an exception if the input is in wrong format,
 * or out of range.
 *
 * @author Matthew Scott Levan 
 * @lab Lab 14 -- FormatExceptions
 * @professor Malcolm McCullough
 * @version 11/18/2014
 *
 */

import java.io.*;
import java.text.*;
import java.util.*;

public class GradeConverter {
    public static void main(String[] args) {
        System.out.println("Please enter the score which you'd like to have converted to a letter grade: ");
        Scanner input = new Scanner(System.in); // for getting raw score from user
        int raw_score; // int variable to hold raw score from the user
        String letter_grade; // for holding the String returned from the Convert(int) method
        try {
            while (input.hasNext()) { // while there's more data from user 
                raw_score = input.nextInt(); // get next line from Scanner
                if (raw_score < 0 || raw_score > 100) { // if raw_score is out of bounds, throw InputMismatchException
                    InputMismatchException e = new InputMismatchException(); // No message necessary, see catch block
                    throw e;
                }
                letter_grade = Convert(raw_score); // call Convert method with raw_score argument
                System.out.println(raw_score + " is a(n) " + letter_grade + ".\n"); // print the letter grade
            }
        }

        catch (InputMismatchException e) {
            System.out.println("Error! Input is out of bounds or of incorrect data type. Please try again.\n"); // friendly error message
        }
    }

    public static String Convert(int raw_score) {
        if (raw_score >= 0 && raw_score < 60) { // if raw_score is between 0-59, return "F" 
            return "F";
        }

        if (raw_score >= 60 && raw_score < 70) { // if raw_score is between 60-69, return "D"
            return "D";
        }

        if (raw_score >= 70 && raw_score < 80) { // if raw_score is between 70-79, return "C"
            return "C";
        }

        if (raw_score >=80 && raw_score < 90) { // if raw_score is between 80-89, return "B"
            return "B";
        }

        if (raw_score >= 90 && raw_score <= 100) { // if raw_score is between 90-100, return "A"
            return "A";
        }
        
        else {
            return null;
        }
    }
}
