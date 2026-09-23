public class Table {

    double height; 
    Circle tableCircle = new Circle(3.0);
    Table(){
        height = 4.0; // default height of table
    }

    Table(double newHeight){
        height = newHeight;
    }

    public static void flip(){
        System.out.println("Cleansing the temple!");
    }

}
