/**
 * Sphere.java, an is-a Circle relationship.
 *   
 * @author Matthew Scott Levan
 * @version 10/21/2014
 * @lab Ten 10 -- Shapes
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */

public class Sphere extends Circle {
   protected double radius;   

   public Sphere() {
       this(0,0,1);  // x,y,radius
   }
   public Sphere( double x, double y, double radius )  {
	  super(x, y, radius);
	  this.radius = radius;
   }
   public double getRadius() { 
      return radius; 
   }
   public double area() { 
      return (4 * Math.PI * Math.pow(radius, 2)); 
   } 
   public double volume() { 
      return (4/3 * Math.PI * Math.pow(radius, 3)); 
   }
   public String toString() { 
      return super.toString(); 
   }
   public String getName() { 
      return "Sphere"; 
   }
   public double getCircleArea() { 
      return super.area(); 
   }
   public String getCircleName() { 
      return super.getName(); 
   }
   public String getCircleString() { 
      return super.toString(); 
   }
   public String getPointString() { 
      return super.getPointString(); }
   public String getPointName() { 
      return super.getPointName(); 
   }
}
