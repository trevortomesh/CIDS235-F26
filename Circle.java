public class Circle {
    private double radius;

    private static int numberOfObjects = 0;

    public Circle(){
        radius = 1.0;
        numberOfObjects++;
    }
    
    public Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    public double getArea(){
        //System.out.println("We have " + Circle.numberOfObjects + " circles!");
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }

    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

}
