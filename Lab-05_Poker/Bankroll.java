/**
 * Bankroll.java
 *   
 * @author Matthew Scott Levan
 * @version 09/23/2014
 * @lab Five 05 -- Assignment #1
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */
 
public class Bankroll
{
     private int bankroll;

     public Bankroll() // default constructor
     {
          bankroll = 0;
     }

     public Bankroll (int n) // one-argument constructor
     {
          bankroll = n;
     }

     public int getBankroll()
     {
          return bankroll;
     }
     public void alterBankroll(int n) // n can be negative
     {
          bankroll+= n;
     }
}
