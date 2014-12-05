/**
 * Circle.java, an is-a Point relationship.
 *   
 * @author Matthew Scott Levan
 * @version 10/21/2014
 * @lab Ten 10 -- Shapes
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */

public class Circle extends Point {  
   protected double radius;
   // private Point p;       // composition 

   public Circle()  {  
      this(0.0, 0.0, 1.0);  
   }

   public Circle(double x, double y, double radius) {
      // p = new Point(x, y);   // instantiate point object     
	  super(x, y);
      setRadius(radius);  
   }

   public void setRadius(double s) { 
      radius = (s >= 0 ? s : 1); // if (s>=0) radius=s; else radius=1;
   }

   public double getRadius() { 
      return radius; 
   }
   
   public double area() { 
      return (Math.PI) * (Math.pow(radius, 2)); 
   }

   public String toString() { 
      return "Point = " + super.toString() + "; Radius = " + radius; 
   }
 
   public String getName() { 
      return "Circle"; 
   }
   public String getPointName() { 
      return super.getName(); 
   }
   public String getPointString() {  
      return super.toString(); 
   }
}
