package while_Loop_Questions;
import java.util.*;

public class Power {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a: ");
		int a=sc.nextInt();
		System.out.println("Enter b: ");
		int b=sc.nextInt();
		int pow=1;
		int i=1;
		while(i<=b)
		{
			pow=pow*a;
		i++;
		}
		System.out.println(a+" to power "+b+" is: "+pow);
	}
}
