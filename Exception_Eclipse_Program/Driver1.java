package Exception_Eclipse_Program;
import java.util.*;
public class Driver1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		try {
			Registration.checkEligiblity(age);
		}catch(UnderAgeException e)
		{
			System.out.println("You are Under Age!!");
		}
	}
}
