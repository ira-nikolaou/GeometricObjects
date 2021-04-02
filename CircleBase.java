abstract class CircleBase implements Comparable <CircleBase>
{
    private String colour; //can only be accessed in this class
    
    protected int radius; //can be accessed by subclasses/package
    protected int height;
    
    //abstract methods
    abstract double getArea();
    abstract double getVolume();

    //constructor creates object with default radius of 1
    public CircleBase()
    {    
        radius=1;
    }

//Overloaded constructor allow user to set radius
    public CircleBase(int radius)
    {
       this.radius = radius;
    }

//Set method for radius
    public void setRadius(int radius){
        this.radius = radius;

    }

//Get method for radius
    public int getRadius (){
        return radius;
    }

//Sets colour for object 
    public void setColour(String colour){
        this.colour = colour; 
    }
  //returns the colour as a String
    public String getColour (){
        return colour;
    }
  
  //returns the height as an int
  public int getHeight(){
    return this.height;
  }
  //sets the height of the shape
  public void setHeight(int height){
    this.height=height;
  }

    //compareTo method to compare shapes by their surface area.
    // returns -1 if this is smaller than other;
    //returns 0 if the shapes are same
    // returns 1 if this is bigger than other;
  public int compareTo(CircleBase other){
   return Double.compare(this.getArea(), other.getArea());
  }
}
