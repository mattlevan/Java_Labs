// Shape.java
// Definition of base class Shape (could/will be abstract)

public abstract class Shape implements Comparable {
   public double area() { return 0.0; }
   public double volume() { return 0.0; }
   public String getName() { return "Shape"; }

   public int compareTo(Object o) {
       if (((Shape)o).area() == area()) {
           return 0;
       }

       if (((Shape)o).area() < area()) {
           return -1;
       }

       if (((Shape)o).area() > area()) {
           return 1;
       }
       else {return 3;} // return 3 for error
   }
}
