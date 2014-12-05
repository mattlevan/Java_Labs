/**
 * Square.java, an is-a Point relationship.
 *   
 * @author Matthew Scott Levan
 * @version 10/14/2014
 * @lab Nine 09 -- Shapes
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */

public class Square extends Point {  
   protected double side;
   // private Point p;       // composition 

   public Square()  {  
      this(0.0, 0.0, 1.0);  
   }

   public Square(double x, double y, double side) {
      // p = new Point(x, y);   // instantiate point object     
	  super(x, y);
      setSide(side);  
   }

   public void setSide(double s) { 
      side = (s >= 0 ? s : 1); // if (s>=0) side=s; else side=1;
   }

   public double getSide() { 
      return side; 
   }
   
   public double area() { 
      return Math.pow(side, 2); 
   }

   public String toString() { 
      return "Corner = " + super.toString() + "; Side = " + side; 
   }
 
   public String getName() { 
      return "Square"; 
   }
   public String getPointName() { 
      return super.getName(); 
   }
   public String getPointString() {  
      return super.toString(); 
   }
}
