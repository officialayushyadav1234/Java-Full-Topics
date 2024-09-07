package method;

import java.util.Scanner;
public class PrintFactorialOfDigit {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		while(n>0)
		{
			getFactorial(n%10);
		  n=n/10;
		}
	}
	
	public static void getFactorial(int n)
	{
		int fact = 1;
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		System.out.println(n+ "!=" +fact);
	}
}
