public class Engine {
    private int horsepower;
    private boolean running;

    Engine(int horsepower){
        this.horsepower = horsepower;
    }

    void start(){
        running = true;
        System.out.println("Engine (" + horsepower + " hp) rumbles to life.");
    }

    boolean isRunning(){
        return running;
    }

}
