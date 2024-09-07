package has_a_relationship;

public class Processor {

	double speed;
	int no_of_core;
	
	Processor()
	{
		
	}
	
	Processor(double speed, int no_of_core)
	{
		this.speed=speed;
		this.no_of_core=no_of_core;
	}
	
	public void displayProcessor()
	{
		System.out.println("Speed is: "+speed+"GHZ");
		System.out.println("Core is: "+no_of_core);
	}
}
