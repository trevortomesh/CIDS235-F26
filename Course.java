import java.util.ArrayList;

class Course{
    private String code;
    private final ArrayList<Student> roster = new ArrayList<>();

    Course(String code){
        this.code = code;
    }

    String getCode(){
        return code;
    }

    void addStudent(Student s){
        roster.add(s);
    }

    void removeStudent(Student s){
        roster.remove(s);
    }

    @Override public String toString(){
        StringBuilder sb = new StringBuilder(code + " roster: ");
        for(Student s: roster){
            sb.append(s.getName()).append(' ');
        }

        return sb.toString().trim();
    }

}