package constructor;

public class Vehicle {

	static int count = 0;
	
	Vehicle()
	{
		count++;
		System.out.println("Vehicle Object " +count+ "is Created");
	}
}
