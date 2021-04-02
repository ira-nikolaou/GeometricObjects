
class MainW1 {
  public static void main(String[] args) {
    // create a cone object
    Cone cone = new Cone(3, 4);
    // create a cylinder object
    Cylinder cylinder = new Cylinder(3, 4);

    // Print cone to String
    System.out.println(cone);
    
    //Set cone colour
    System.out.println("Set colour to green...");cone.setColour("Green");

    //print cone colour
    System.out.println("This shape has the colour " + cone.getColour());

    //print cone Area and Volume
    System.out.println("Area of cone: " + cone.getArea());
    System.out.println("Volume of cone: " + cone.getVolume());
    System.out.println("\n");

    // print cylinder to string
    System.out.println(cylinder);

    //Set cylinder colour
    System.out.println("Set colour to red... "); cylinder.setColour("Red");

    //Print cylinder colour
    System.out.println("This shape has the colour " + cylinder.getColour());

    //Print Area and Volume of cylinder
    System.out.println("Area of cylinder: " + cylinder.getArea());
    System.out.println("Volume of cylinder: " + cylinder.getVolume());
  }
}
