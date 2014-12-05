/**
 * superDie.java, a program that models a single die with an arbitrary number of sides.
 *   
 * @author Matthew Scott Levan
 * @version 09/30/2014
 * @lab Five 06 -- superDie
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */
 
import java.util.*; 		//for the Random class
public class superDie
{
     private int numSide;
     private Random random;

     public superDie()  			//default constructor -- one 6-sided die
     {
		  numSide = 6;
		  random = new Random();
     }

     public superDie(int n) 		//one argument constructor (a die with n-sides)
     {
          numSide = n;
		  random = new Random();
		  
     }
	 
	 public superDie(int n, Random randy)
	 {
		  numSide = n;
		  random = randy;
	 }
	 
     public int roll()
     //returns the face value of the current superDie after "rolling" it
     {
		int face_value = 0;
		face_value = random.nextInt(numSide) + 1;   // face_value  =  an integer between 1 and numSide, inclusive
		return face_value;
     }

     public int getNumSide()
     {
          return numSide;
     }

     public void setNumSide(int n)
     {
          if (n < 1) {
			System.out.println("Die must have at least 1 side!");
		  }
		  
		  else {
		  numSide = n;
		  }
     }
}
