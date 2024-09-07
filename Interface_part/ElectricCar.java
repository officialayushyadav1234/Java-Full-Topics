package Interface_part;

public class ElectricCar implements Car{

	@Override
	public void start()
	{
		System.out.println("Start the electriccar");
	}
	
	@Override
	public void stop()
	{
		System.out.println("Stop the electriccar");
	}
	@Override
	public void openGate()
	{
		System.out.println("open gate in the electriccar");
	}
}
