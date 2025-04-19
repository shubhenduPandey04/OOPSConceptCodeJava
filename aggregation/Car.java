package oops.aggregation;

public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine=engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Car started moving..");
    }
}
