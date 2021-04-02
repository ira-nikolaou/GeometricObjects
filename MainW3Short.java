import java.util.Scanner;
import java.util.Arrays;

class MainW3Short { 
    public static void main (String []args){
// Creating an abstract data type array from CircleBase that can hold 5 objects
    int arraySize=5;
    CircleBase[] circleBase = new CircleBase[arraySize];   

        circleBase[0] = new Cone();
        circleBase[1] = new Cylinder(10,6);
        circleBase[2] = new Cone(8,20);
        circleBase[3] = new Cylinder(52,7);
        circleBase[4] = new Cylinder(1,4);

    // Print out all objects as entered and their surface areas
    for (int i = 0; i < 5; i++) {
      int count = 1 + i;
      System.out.println("Shape " + count + ": " + circleBase[i]);
      System.out.println("Area of Shape " + count + ": " + circleBase[i].getArea() + "\n");
    }

    System.out.println("Shapes sorted by smallest to largest surface area:");

    // sort array by surface area size and print in new order
    Arrays.sort(circleBase);
    for (int i = 0; i < 5; i++) {
      int count = 1 + i;
      System.out.println("Shape " + count + ": " + circleBase[i]);
    }
     
     //add space
     System.out.println();

     //prints the largest shape
     System.out.println("The shape with the largest surface area is a " + circleBase[circleBase.length-1] + "\nThe surface area is " + circleBase[circleBase.length-1].getArea() + ".");

     //add space
     System.out.println();

//prints the smallest shape
     System.out.println("The shape with the smallest surface area is a " +circleBase[0] + "\nThe surface area is "+circleBase[0].getArea() + "." );
  }
}
