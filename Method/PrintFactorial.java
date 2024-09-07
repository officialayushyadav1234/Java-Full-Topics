package method;

public class PrintFactorial {

	public static void main(String [] args)
	{
		for(int i=1; i<=15; i++)
		{
			getFactorial(i);
		}
	}
	
	public static void getFactorial(int n)
	{
		int fact = 1;
		for(int i=1; i<=n; i++)
		{
			fact = fact*i;
		}
		System.out.println(n+ "!=" +fact);
	}
}
