package method_Overriding;

public class User {
    
    public static void main(String[] args) {
        
        Game g1 =new Game();

        Vehicle v1 = g1.getVehicle();
        v1.start();
    }
}
