public class Circle {
    private double radius;

    private static int numberOfObjects = 0;

    Circle(){
        radius = 1.0;
        numberOfObjects++;
    }
    
    Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    double getArea(){
        System.out.println("We have " + Circle.numberOfObjects + " circles!");
        return Math.PI * radius * radius;
    }

    double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    double getRadius(){
        return radius;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }

}
