package while_Loop_Questions;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	int i=1;
	int count=0;
	while(i<=n/2)
	{
		if(n%i==0)
		{
			count++;
		}
	i++;
	}
	if(count==1)
		System.out.println("It is a Prime Number");
	else
		System.out.println("It is NOT a Prime Number");
 }
}
