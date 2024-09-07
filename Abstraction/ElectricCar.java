public class ElectricCar extends Car {
    
    @Override
    public void start()
    {
        System.out.println("Start the ElectricCar");
    }

    @Override
    public void stop()
    {
        System.out.println("Stop the ElelctricCar");

    }
    @Override
    public void applyBreak()
    {
        System.out.println("applyBreak in the ElectricCar");
    }
    @Override
    public void playMusic()
    {
        System.out.println("playMusic in the ElectricCar");
    }
}
