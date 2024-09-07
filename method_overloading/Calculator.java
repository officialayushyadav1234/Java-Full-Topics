package method_overloading;

public class Calculator {

	public static void add(int a, int b)
	{
		System.out.println("int, int add method");
		System.out.println("The Sum is:" +(a+b));
	}
	
	public static void add(int a, double b)
	{
		System.out.println("int, double add method");
		System.out.println("The Sum is:" +(a+b));
	}
	
	public static void add(double a, int b)
	{
		System.out.println("double,int add method");
		System.out.println("The Sum is: " +(a+b));
	}
	
	public static void add(double a, double b)
	{
		System.out.println("double, double add method");
		System.out.println("The Sum is: " +(a+b));
	}
	
	public static void add(int a, int b, int c)
	{
		System.out.println("int, int, int add method");
		System.out.println("The Sum is:" +(a+b+c));
	}
	
	public static void add(int a,int b,double c)
	{
		System.out.println("int, int, double add method");
		System.out.println("The Sum is:" +(a+b+c));
	}
	
	public static void add(int a,double b,double c)
	{
		System.out.println("int,double,double add method");
		System.out.println("The Sum is:" +(a+b+c));
	}
	
	public static void add(double a,double b, double c)
	{
		System.out.println("double,doule,double add method");
		System.out.println("The Sum is:" +(a+b+c));
	}
}
