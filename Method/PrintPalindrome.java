package method;

public class PrintPalindrome {

	static int count = 0;
	public static void main(String [] args)
	{
		for(int i=1000; i<=5000; i++)
		{
			checkPalindrome(i);
			
		}
		System.out.println("\nTotal Such Numbers are: "+count);
	}
	public static void checkPalindrome(int n)
	{
		int rev=0;
		int a=n;
		while(n>0)
		{
			int rem=n%10;
			rev=10*rev+rem;
			
		 n=n/10;	
		}
		if(a==rev)
		{
			System.out.println(a+"");
			count++;
		}
	}
}
