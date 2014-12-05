// Driver.java
// Driver for Lab 11 that creates an array of shapes, populates it, sorts it, and prints it
import java.util.*;

public class Driver {
   public static void main(String[] args) {
       Shape arrayOfShapes[];
       Scanner size = new Scanner(System.in); // initialize a Scanner to collect the user's input for size of Shape array
       System.out.println("Please enter the size of your Shape array: ");
       arrayOfShapes = new Shape[size.nextInt()]; // set the size of the Shape array to the user specified value

       for (int i = 0; i < arrayOfShapes.length; i++) { // populate the array with a loop, asking user for Shape type and parameters
           System.out.println("Which kind of Shape would you like to create?\n");
           System.out.println("For Point, press '0'.");
           System.out.println("For Square, press '1'.");
           System.out.println("For Cube, press '2'.");
           System.out.println("For Circle, press '3'.");
           System.out.println("For Cylinder, press '4'.");
           System.out.println("For Sphere, press' 5'.");

           Scanner shape = new Scanner(System.in);
           int selection = shape.nextInt();
           if (selection == 0) { // Point
               System.out.println("Enter a value for x: ");
               double x = shape.nextDouble();
               System.out.println("Enter a value for y: ");
               double y = shape.nextDouble();
               arrayOfShapes[i] = new Point(x,y);
           }

           if (selection == 1) { // Square
               System.out.println("Square!\n");
               System.out.println("Enter a value for x: ");
               double x = shape.nextDouble();
               System.out.println("Enter a value for y: ");
               double y = shape.nextDouble();
               System.out.println("Enter a value for side length: ");
               double side = shape.nextDouble();
               arrayOfShapes[i] = new Square(x,y,side);
           }

           if (selection == 2) { // Cube
               System.out.println("Cube!\n");
               System.out.println("Enter a value for x: ");
               double x = shape.nextDouble();
               System.out.println("Enter a value for y: ");
               double y = shape.nextDouble();
               System.out.println("Enter a value for side length: ");
               double side = shape.nextDouble();
               arrayOfShapes[i] = new Cube(x,y,side);
           }

           if (selection == 3) { // Circle
               System.out.println("Circle!\n");
               System.out.println("Enter a value for x: ");
               double x = shape.nextDouble();
               System.out.println("Enter a value for y: ");
               double y = shape.nextDouble();
               System.out.println("Enter a value for radius: ");
               double radius = shape.nextDouble();
               arrayOfShapes[i] = new Circle(x,y,radius);
           }

           if (selection == 4) { // Cylinder
               System.out.println("Cylinder!\n");
               System.out.println("Enter a value for x: ");
               double x = shape.nextDouble();
               System.out.println("Enter a value for y: ");
               double y = shape.nextDouble();
               System.out.println("Enter a value for radius: ");
               double radius = shape.nextDouble();
               System.out.println("Enter a value for height: ");
               double height = shape.nextDouble();
               arrayOfShapes[i] = new Cylinder(x,y,radius,height);
           }

           if (selection == 5) { // Sphere
               System.out.println("Sphere!\n");
               System.out.println("Enter a value for x: ");
               double x = shape.nextDouble();
               System.out.println("Enter a value for y: ");
               double y = shape.nextDouble();
               System.out.println("Enter a value for radius: ");
               double radius = shape.nextDouble();
               arrayOfShapes[i] = new Sphere(x,y,radius);
           }
       }

       System.out.println("\nHere are your unsorted shapes: \n"); // print out the unsorted array
       for (int i = 0; i < arrayOfShapes.length; i++) {
           System.out.println(arrayOfShapes[i].getName() + ":\n");
           System.out.println(arrayOfShapes[i]);
           System.out.println("Area: " + arrayOfShapes[i].area());
       }

       SelectionSort sort = new SelectionSort(); // initialize new SelectionSort object with constructor
       sort.sort(arrayOfShapes, arrayOfShapes.length); // sort arrayOfShapes using SelectionSort sort()

       System.out.println("\nHere are your sorted shapes in descending order, by area: \n"); // print out sorted array
       for (int i = 0; i < arrayOfShapes.length; i++) {
           System.out.println(arrayOfShapes[i].getName() + ":\n");
           System.out.println(arrayOfShapes[i]);
           System.out.println("Area: " + arrayOfShapes[i].area());
       }
   }
}   
   
   
   
   
