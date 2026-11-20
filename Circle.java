public class Circle extends GeometricObject{
    private double radius;

    private static int numberOfObjects = 0;

    public Circle(){
       this(1.0);
    }
    
    public Circle(double radius){
        this.radius = radius;
        numberOfObjects++;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
        numberOfObjects++;
    }

    public double getArea(){
        //System.out.println("We have " + Circle.numberOfObjects + " circles!");
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    public void printCircle(){
        System.out.println("The circle is created " + getDateCreated() + 
            " and the radius is " + radius);
    }

}
