package Polymorphism;

public class Calculator {
 
    
    public void add(int a, int b)
	{
		System.out.println("The int, int add method is executing");
		System.out.println("Sum is: "+(a+b));
	}
	public void add(int a, int b, int c)
	{
		System.out.println("The int, int, int add method is executing");
		System.out.println("Sum is: "+(a+b+c));
	}
	public void add(int a, double b)
	{
		System.out.println("The int, double add method is executing");
		System.out.println("Sum is: "+(a+b));
    }
}
