package method;

public class Program3 {

	public static void test()
	{
		System.out.println("This is test Method");
	}
	
	public static void main (String[] args)
	{
		System.out.println("Main method Start");
		Program1.getFactorial();
		demo();
		System.out.println("Main Ends!!");
	}
	
	public static void demo()
	{
		System.out.println("Demo method Start");
		test();
		System.out.println("Demo Methods Ends!!");
	}
}
