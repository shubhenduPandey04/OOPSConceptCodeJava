package Inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Car Actions ===");
        Car lemboCar = new Car();
        lemboCar.start();
        lemboCar.fuelType();
        lemboCar.openTrunk();
        lemboCar.Stop();
        
        System.out.println("\n=== Bike Actions ===");
        Bike splendor = new Bike();
        splendor.start();
        splendor.fuelType();
        splendor.kickStart();
        splendor.Stop();
    }
}
