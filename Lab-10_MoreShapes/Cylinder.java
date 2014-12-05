/**
 * Cylinder.java, an is-a Circle relationship.
 *   
 * @author Matthew Scott Levan
 * @version 10/21/2014
 * @lab Ten 10 -- Shapes
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */

public class Cylinder extends Circle {
   protected double radius; 
   protected double height;
   // private Square s;       // composition

   public Cylinder() {
       this(0,0,1,1);  // x,y,radius,height
   }
   public Cylinder( double x, double y, double radius, double height )  {
      // for a cylinder, height and radius may be different
      // s = new Square( x, y, side ); 
	  super(x, y, radius);
      this.height = height;
   }
   public Cylinder(double x, double y, double radius)  {
      // s = new Square(x, y, radius); 
      super(x, y, radius);
	  height = radius;
   }
   public double getHeight() { 
      return height; 
   }
   public double area() { 
      return (2 * super.area() + 2 * Math.PI * radius * height); 
   } 
   public double volume() { 
      return super.area() * height; 
   }
   public String toString() { 
      return super.toString() + "; Height = " + height; 
   }
   public String getName() { 
      return "Cylinder"; 
   }
   public double getCircleArea() { 
      return super.area(); 
   }
   public String getCircleName() { 
      return super.getName(); 
   }
   public String getSquareString() { 
      return super.toString(); 
   }
   public String getPointString() { 
      return super.getPointString(); }
   public String getPointName() { 
      return super.getPointName(); 
   }
}
