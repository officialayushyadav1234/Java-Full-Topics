package non_Static_And_Static;

public class Employ {

	static int x=12;
	int y=45;
	public static void test()
	{
		System.out.println("static test method");
		System.out.println("the value of x is: "+x);
		demo();
		Employ e1=new Employ();
		System.out.println("y from static method is: "+e1.y);
	}
	public static void demo()
	{
		System.out.println("this is static demo method");
	}
	public void start()
	{
		System.out.println("This is non-static start method");
		System.out.println("y is: "+y);
		run();
		System.out.println("the value of x is: "+x);
		demo();
	}
	public void run()
	{
		System.out.println("This is non-static run method");
	}
	public static void main(String[] args)
	{
		System.out.println("Main method starts");
		test();
		Employ i=new Employ();
		System.out.println("y from main method is: "+i.y);
		i.start();
	}
}
/*
 Main method starts
static test method
the value of x is: 12
this is static demo method
y from static method is: 45
y from main method is: 45
This is non-static start method
y is: 45
This is non-static run method
the value of x is: 12
this is static demo method

 
*/