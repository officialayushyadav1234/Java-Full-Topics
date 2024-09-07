package Polymorphism;

public class Vehicle1Driver {
   
    public static void main(String[] args) {
        
        Vehicle v1 = new Car();
        Vehicle v2 = new Bus();
        Car c1 = new Car();
        System.out.println(v1.x);
        System.out.println(v1.y);

        System.out.println("=====================================");
        System.out.println(v2.x);
        System.out.println(v2.y);
        System.out.println("=====================================");
        System.out.println(c1.x);
        System.out.println(c1.y);
    }
}
