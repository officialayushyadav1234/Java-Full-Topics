package method;

import java.util.*;
public class Program5 {

	public static void main(String[] args)
	{
		getReverse();
	}
	
	public static void getReverse()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int rev = 0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("The Reverse value is:" +rev);
	}
}
