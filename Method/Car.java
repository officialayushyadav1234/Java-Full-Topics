package method;

public class Car {

	public static void start()
	{
		System.out.println("Start the Car");
	}
	
	public static void main(String [] args)
	{
		System.out.println("This is Main Method");
		start();
		Car c1 = new Car();
		c1.drive();
	}
	
	public void drive()
	{
		System.out.println("Drive the Car");
	}
}
