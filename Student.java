import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private java.util.Date dateCreated;
    
    private ArrayList<Course> courses = new ArrayList<>();

    Student(String name){
        this.name = name;
    }

    void enroll(Course c){
        courses.add(c);
        c.addStudent(this);
    }

    void drop(Course c){
        courses.remove(c);
        c.removeStudent(this);
    }

    void printSchedule(){
        System.out.print(name + " is enrolled in: ");
        for (Course c : courses){
            System.out.print(c.getCode() + " ");
            System.out.println();
        }
    }

    // public Student(int ssn, String newName){
    //     id = ssn;
    //     name = newName;
    //     dateCreated = new java.util.Date();
    // }

    // public int getId(){
    //     return id;
    // }

    public String getName(){
        return name;
    }

    // public java.util.Date getDateCreated(){
    //     return dateCreated;
    // }

}
