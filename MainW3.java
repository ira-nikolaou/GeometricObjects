import java.util.Scanner;
import java.util.Arrays;

class MainW3 {
  public static void main(String[] args) {

    // Creating an abstract data type array from CircleBase that can hold 5 objects
    int arraySize = 5;
    CircleBase[] circleBase = new CircleBase[arraySize];
    // Creating a new scanner object to take in user input
    Scanner scan = new Scanner(System.in);

    // Print message to inform user the process has begun
    System.out.println("Welcome! You will now be prompted to select 5 shapes of your choice.\n");

    // enter for loop to create 5 objects and populate the circleBase array
    for (int i = 0; i < arraySize; i++) {
      int count = i + 1;

      String shapeType;
      boolean validShape = false;

      String defineSize;
      boolean validDecisionInput = false;

      String wrongInput;
      int height;
      int radius;

      // Enter do-while loop that repeats until the user has provided valid input that
      // defines the preferred shape
      do {
        // Request user input to define shape type (cone or cylinder)
        System.out.println("Creating shape number " + count + ":\nPlease enter co for a Cone, or cy for Cylinder.");
        shapeType = scan.nextLine();

        // Create a cone or cyclinder object based on the input provided
        if (shapeType.equals("co") || shapeType.equals("CO")) {
          validShape = true;
          shapeType = "Cone";
          circleBase[i] = new Cone();
        } else if (shapeType.equals("cy") || shapeType.equals("CY")) {
          validShape = true;
          shapeType = "Cylinder";
          circleBase[i] = new Cylinder();
        } else {
          System.out.println("Sorry, the input \"" + shapeType + "\" you have entered is invalid. Please try again.\n");
          validShape = false;
        }

      } while (validShape == false);

      // Output the created shape
      System.out.println("You have selected a " + shapeType + ".\n");

      // enter do-while loop that asks user to specify whether they want to define
      // radius and height
      // loop exists when valid input (yes or no) has been entered
      do {
        // Ask user whether they would like to set a height and radius
        System.out.println("Would you like to define the height and radius of the " + shapeType
            + "?\nPlease select y for \"yes\" or n for \"no\".");
        defineSize = scan.nextLine();

        // Adjust object based on user input and print final object
        if (defineSize.equals("y") || defineSize.equals("Y")) {
          validDecisionInput = true;
          System.out.println("You have selected \"yes\".");

          // enter do-while loop that exits only once user provides int value for height
          do {
            System.out.println("Please enter the height of this " + shapeType + " as a whole number greater than 0:");
            while (!scan.hasNextInt()) {
              wrongInput = scan.next();
              System.out.println("The input \"" + wrongInput
                  + "\" is invalid. Please enter the height as a whole number greater than 0:");
            }
            height = scan.nextInt();
          } while (height < 1);

          // print out a confirmation of the entered height value
          System.out.println("You have entered the height " + height + ".\n");

          // set object height
          circleBase[i].setHeight(height);

          // enter do-while loop that exits only once user provides int value for radius
          do {
            System.out.println("Please enter the radius of this " + shapeType + " as a whole number greater than 0:");
            while (!scan.hasNextInt()) {
              wrongInput = scan.next();
              System.out.println("The input \"" + wrongInput
                  + "\" is invalid. Please enter the radius as a whole number greater than 0:");
            }
            radius = scan.nextInt();
          } while (radius < 1);

          // print out a confirmation of the entered radius value
          System.out.println("You have entered the radius " + radius + ".\n");

          // set object radius
          circleBase[i].setRadius(radius);

          // print final object with specifications
          System.out.println("Shape number " + count + " is a " + circleBase[i]);
          scan.nextLine();

        } else if (defineSize.equals("n") || defineSize.equals("N")) {
          validDecisionInput = true;

          // user has decided to not enter a specific radius or height.
          // Default object with value 1 for height and radius is created
          System.out
              .println("You have selected \"no\". This " + shapeType + " has the default height and radius of 1.\n");
          System.out.println("Shape number " + count + " is a " + circleBase[i] + "\n");

        } else {
          validDecisionInput = false;
          System.out.println("The input \"" + defineSize + "\" is invalid. Please try again.\n");
        }
      } while (validDecisionInput == false);

      System.out.println("----------------------");
    }

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

    // add space
    System.out.println();

    // prints the largest shape
    System.out.println("The shape with the largest surface area is a " + circleBase[circleBase.length - 1]
        + "\nThe surface area is " + circleBase[circleBase.length - 1].getArea() + ".");

    // add space
    System.out.println();

    // prints the smallest shape
    System.out.println("The shape with the smallest surface area is a " + circleBase[0] + "\nThe surface area is "
        + circleBase[0].getArea() + ".");
  }
}
