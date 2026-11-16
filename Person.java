public class Person {
    private Person supervisor;
    private Name name;

    Person(String name){
        this.name = new Name(name);
        this.supervisor = null; 
    }

    public String getName(){
        return name.getName();
    }

    public void setSupervisor(Person s){
        supervisor = s; 
    }

    public String getSupervisor(){
        if(supervisor != null){
            return supervisor.getName();
        }
        else{
            return "No supervisor found!";
        }
    }

}
