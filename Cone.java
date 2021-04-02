class Cone extends CircleBase{

    //Contructor for cone object
    //Sets default radius and height to 1
    public Cone(){
        //Uses super() constructor for radius;
        height=1;
    }

    //Overloaded contructor for cone object
    //Allows user to set radius and height
    public Cone(int radius,int height){
        super(radius);
        this.height=height;
    }

    //get volume method calculates returns the volume of the cone
    public double getVolume(){
        return (height*(Math.PI)*(radius*radius))/3;
    }

    //get area method calculates returns the surface area of the cone
    public double getArea(){
        double length = Math.sqrt(radius * radius + height * height);
        return Math.PI  * radius * (radius + length);
    }
    
    //To String method prints object
    public String toString(){
    return "Cone with a radius of " + radius + " and a height of " + height + ".";
    }
}