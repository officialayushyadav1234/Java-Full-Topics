package Interface_part;

public interface Vehicle {

	int x=35;
	public void start();
	public void stop();
	
	
	/*Vehicle()
	{
		
	}*/
	private static void test()
	{
		System.out.println("This is test method");
	}
	default void demo()
	{
		System.out.println("this is demo method");
	}
}
