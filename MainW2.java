import java.util.Scanner;

class MainW2 {
  public static void main(String[] args) {
    // create a cone object
    Cone cone = new Cone(20, 4);
    // create a cylinder object
    Cylinder cylinder = new Cylinder(3, 80);

    // Print shape and area
    System.out.println(cone);
    System.out.println("Area of cone: " + cone.getArea() + "\n");

    // Print shape and area
    System.out.println(cylinder);
    System.out.println("Area of cylinder: " + cylinder.getArea() + "\n");

    // use compareTo method and print result
    if (cone.compareTo(cylinder) == 1) {
      System.out.println("The cone is bigger than the cylinder.\n");
    } else if (cone.compareTo(cylinder) == -1) {
      System.out.println("The cone is smaller than the cylinder.\n");
    } else {
      System.out.println("The shapes have the same size.\n");
    }
  }
}