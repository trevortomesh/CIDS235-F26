public class F {
    private int x = 0; //instance variable
    private int y = 0; 

    private int i = 5;
    private static double k = 0;

    public F(){}

    public void setI(int i ){
        this.i = i;
    }

    public static void setK(double k){
        F.k = k;
    }

    public void p(){
        int x = 1; //local variable
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
