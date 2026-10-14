public class Mailbox {
    
    private Object myObject;

    public void deliverMail(Object newObject){
        myObject = newObject;
    }

    public Object getMail(){
        return myObject;
    }

}
