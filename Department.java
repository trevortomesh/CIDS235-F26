import java.util.ArrayList;

public class Department {
    
    private String name;
    private ArrayList<Professor> faculty;

    Department(String name, ArrayList<Professor> faculty){
        this.name = name;
        this.faculty = new ArrayList<>(faculty);
    }

    void addProfessor(Professor p){
        faculty.add(p);
    }

    void printFaculty(){
        System.out.println(name + " faculty:");
        for(Professor p : faculty){
            System.out.println(" " + p.getName());
        }
    }

}
