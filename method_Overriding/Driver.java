package method_Overriding;

public class Driver {

    public static void main(String[] args) {
        
        Vehicle v1 = new Car();

        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}

