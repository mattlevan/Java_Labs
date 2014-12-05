/**
 * Point.java, contains three doubles (x,y); a has-a relationship with double.
 *   
 * @author Matthew Scott Levan
 * @version 10/14/2014
 * @lab Nine 09 -- Shapes
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */

public class Point extends Shape {
   protected double x, y; // coordinates of the Point

   public Point(double x, double y) { 
      setPoint(x, y); 
   }
   public void setPoint(double x, double y) { 
      this.x = x; 
      this.y = y; 
   }
   public double getX() { 
      return x; 
   }
   public double getY() { 
      return y; 
   }
   public String toString() {    // override Object's toString for nice printing
      return "[" + x + ", " + y + "]"; 
   }
   public String getName() { 	
      return "Point"; 
   }

   public boolean equals (Object p){ // override Object's equals to compare x&y
      if (p instanceof Point) { 
         return ( (x==((Point)p).x) && (y==((Point)p).y));
      } else {
         System.out.println("Error in Point.equals object of wrong type");
         System.exit(1);
      }
      return false;  // should never get here
   }

}
