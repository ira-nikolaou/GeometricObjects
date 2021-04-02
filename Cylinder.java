
class Cylinder extends CircleBase
{ 
    //Contructor for cylinder object
    //Sets default radius and height to 1
    public Cylinder()
    {
        //Uses super() constructor for radius;
        height = 1; 
    }

    //Overloaded contructor for cylinder object
    //Allows user to set radius and height
    public Cylinder(int radius, int height)
    {
        super(radius);
        this.height=height; 
    }

    //get volume method calculates returns the volume of the cylinder
    public double getArea(){
        return 2*Math.PI*radius*(height)+2*Math.PI*(radius*radius);
    }

    //get area method calculates returns the surface area of the cylinder
    public double getVolume() {
        return (Math.PI*(radius*radius)*height); 
    }
    
    //To String method prints object
    public String toString(){
    return "Cylinder with a radius of " + radius + " and a height of " + height + ".";
    }
}
