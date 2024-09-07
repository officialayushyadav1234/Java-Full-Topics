package do_while_Loop;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char c;
		do{
			System.out.println("ENter the Number: ");
			int n=sc.nextInt();
			int fact=1;
			int i=1;
			while(i<=n)
			{
				fact=fact*i;
				i++;
			}
			System.out.println(n+"!= "+fact);
			System.out.println("Press Y/y to continue or any oth. char. to STOP!");
			c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
		System.out.println("Thank You!Program ENDS NOW!!");
	}
}
