/**
 * RecurPali.java
 *   A recursive program that determines whether or not an integer 
 *   is a numerical palindrome.
 *   
 * @author Matthew Scott Levan
 * @version 09/02/2014
 * @lab Two
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */

package recurspali;
import java.util.Scanner;
public class RecursPali {
    public static void main(String[] args) {
        int n;
        
        System.out.println("Welcome to Palindrome Test v1.0. Enter a positive number to test if it is a palindrome: ");
        
        Scanner in = new Scanner(System.in);
	n = in.nextInt();
        
        String str = Integer.toString(n);
        
        if (testPali(str) == true) {
            System.out.println("Yes, your number is a palindrome.");
        }
        
        else {
            System.out.println("No, your number is not a palindrome.");
        }
    }
    
    public static boolean testPali(String input) {
        int length = input.length();
        
        if (length > 1) {
            if (input.charAt(0) == input.charAt(length-1)) {
                String newStr = input.substring(1,(length-1));
                testPali(newStr);
            }
            
            else {
                return false;
            }
        }
        
        return true;
    }
}
