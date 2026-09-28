public class Circle {
    double radius;

    static int numberOfObjects = 0;

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

    static int getNumberOfObjects(){
        return numberOfObjects;
    }
}
