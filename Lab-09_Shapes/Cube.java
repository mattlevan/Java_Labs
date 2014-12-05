/**
 * Cube.java, an is-a Square relationship.
 *   
 * @author Matthew Scott Levan
 * @version 10/14/2014
 * @lab Nine 09 -- Shapes
 * @professor Malcolm McCullough
 * @university California State University, Dominguez Hills
 * @course CSC 123: Intro to Programming and Computer Science II
 * @semester Fall 2014
 */

public class Cube extends Square {
   protected double depth;   
   // private Square s;       // composition

   public Cube() {
       this(0,0,1,1);  // x,y,side,depth
   }
   public Cube( double x, double y, double side, double depth )  {
      // for a cube depth and side should be the same
      // s = new Square( x, y, side ); 
	  super(x, y, side);
      this.depth = depth;
   }
   public Cube(double x, double y, double side)  {
      // s = new Square(x, y, side); 
      super(x, y, side);
	  depth = side;
   }
   public double getDepth() { 
      return depth; 
   }
   public double area() { 
      return super.area() * 6; 
   } 
   public double volume() { 
      return super.area() * depth; 
   }
   public String toString() { 
      return super.toString() + "; Depth = " + depth; 
   }
   public String getName() { 
      return "Cube"; 
   }
   public double getSquareArea() { 
      return super.area(); 
   }
   public String getSquareName() { 
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
