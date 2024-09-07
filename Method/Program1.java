package method;

import java.util.Scanner;
public class Program1 {

	public static void getFactorial()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		
		int fact = 1;
		for(int i=1 ; i<=n ; i++ )
		{
			fact = fact*i;
		}
		System.out.println(n+ "!=" +fact);
	}
	
	public static void test()
	{
		System.out.println("This is Test Method");
	}
	
	public static void main(String[] args)
	{
		System.out.println("This is Main method");
		getFactorial();
		Car.start();             // static method call 
		Car c1 = new Car();      // Non-static method call
		c1.drive();
	}
	
	public static void demo()
	{
		System.out.println("This is demo Method");
	}
}


