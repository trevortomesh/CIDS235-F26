public class Circle {
    private double radius;

    private static int numberOfObjects = 0;

    public Circle(){
        radius = 1.0;
        numberOfObjects++;
    }
    
    public Circle(double radius){
        this.radius = radius;
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

}
