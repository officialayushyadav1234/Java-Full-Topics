package method;

public class Program4 {

	public static void main(String[] args)
	{
		findfactorial(5);
		findfactorial(6);
		findfactorial(7);
		
	}
	
	public static void findfactorial(int n)
	{
		
		int fact=1;
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
			
		}
		System.out.println(n+ "!=" +fact);
	}
}
