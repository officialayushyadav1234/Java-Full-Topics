package method;

public class Program2 {

	public static void test()
	{
		System.out.println("This is test Method");
	}
	
	final public synchronized strictfp static void main(String[] abc)
	{
		System.out.println("This is main Method");
		demo();
		test();
		demo();
	}
	
	public static void demo()
	{
		System.out.println("This is demo Method");
	}
}
