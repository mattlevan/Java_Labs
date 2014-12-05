/**
 * Integervsint.java, a program that compares Integer vs. int.
 *
 * @author Matthew Scott Levan
 * @version 11/06/2014
 * @lab Twelve 12 -- Integervsint
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */

import java.util.*;
import java.io.*;

public class Integervsint {
    public static void main(String[] args) {
        int x[] = new int[1000000]; // array of primitive ints
        Integer y[] = new Integer[1000000]; // array of Integer objects (wrapper class)
    
        // Time the initialization/population of primitive int array x[]
        long start = System.currentTimeMillis(); // get starting time and save it in long variable "start"
        for (int i = 0; i < 1000000; i++) {
            x[i] = i;
        }
        long end = System.currentTimeMillis(); // get end time and save it in long variable "end"
        System.out.println("Time to populate an int array of 1 million values: " + (end-start));

        // Time the initialization/population of Integer object array y[] by using "y[i] = new Integer(i);"
        start = System.currentTimeMillis(); // get starting time
        for (int i = 0; i < 1000000; i++) {
            y[i] = new Integer(i);
        }
        end = System.currentTimeMillis(); // get end time
        System.out.println("Time to populate an Integer array of 1 million values using 'y[i] = new Integer(i);': " + (end-start));

        // Time the initialization/population of Integer object array y[] by using "y[i] = i;" is faster because instead of
        // calling a constructor "new Integer(i)" for each y[i], the compiler simply takes i and plugs it into Integer's single
        // argument constructor from the Integer object already allocated in line 19 "Integer y[] = new Integer[1000000]".
        start = System.currentTimeMillis(); // get starting time
        for (int i = 0; i < 1000000; i++) {
            y[i] = i;
        }
        end = System.currentTimeMillis(); // get end time
        System.out.println("Time to populate an Integer array of 1 million values using 'y[i] = i;': " + (end-start));
    }
}
