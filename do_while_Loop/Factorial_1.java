package do_while_Loop;
import java.util.*;

public class Factorial_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1;
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
			System.out.println("Press yes to continue or any oth. char. to STOP!");
			s1=sc.next();
		}while(s1.equals("yes")  || s1.equals("YES") || s1.equals("Yes"));
		System.out.println("Thank You!Program ENDS NOW!!");
	}
}
