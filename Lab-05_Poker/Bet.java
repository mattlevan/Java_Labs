/**
 * Bet.java
 *   
 * @author Matthew Scott Levan
 * @version 09/23/2014
 * @lab Five 05 -- Assignment #1
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */

import java.util.*;
public class Bet
{
     private int bet;
     public Bet()  //default constructor sets bet to 0
     {
          bet = 0;
     }

     public Bet(int n) //one-argument constructor,  sets bet to n
     {
          bet = n;
     }

     public void setBet(int n) //setter
     {
          bet = n;
     }

     public int getBet() //getter
     {
          return bet;
     }
}
