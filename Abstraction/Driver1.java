public class Driver1 {
    
    public static void main(String[] args) {
        
        Vehicle v1 = new ElectricCar();
        v1.start();
        v1.stop();
        v1.applyBreak();

        System.out.println("==================");

        Car c1 = new ElectricCar();
        c1.start();
        c1.stop();
        c1.applyBreak();
        c1.openGate();
        c1.playMusic();
    }
}
