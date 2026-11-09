public class Car {
    private String model;
    private Engine engine;

    Car(String model, int horsepower){
        this.model = model;
        this.engine = new Engine(horsepower);
    }

    void start(){
        System.out.println(model + " turning the key...");
        engine.start();
    }

}
