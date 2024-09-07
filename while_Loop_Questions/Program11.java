package while_Loop_Questions;
import java.util.*;

public class Program11 {

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
				System.out.println(i);
				count++;
			}
		i++;
		}
		
		System.out.println("Total Factors are: "+count);
	}
}
