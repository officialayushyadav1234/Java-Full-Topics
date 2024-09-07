package Polymorphism;

public class VehicleDriver {
    
    public static void main(String[] args) {
        
        Vehicle.start();
        Bus.start();
        Car.start();
        System.out.println("=======================================");
        Vehicle v1 = new Car();
        Vehicle v2 = new Bus();
        Car c1 = new Car();
        v1.start();
        v2.start();
        c1.start();
    }
}
