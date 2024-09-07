package Encapsulation_Java;
import java.util.*;

public class Employ {

	
		private int pwd=7753;
		private String name;
		private int id;
		private double salary;
		public String getName()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Password: ");
			int upwd=sc.nextInt();
			if(pwd==upwd)
			{
				System.out.println("Validation is Successfull!");
				return name;
			}
			else {
				System.out.println("INVALID PASSWORD!!");
				return null;
			}
		}
		public int getId()
		{
			//validation
			return id;
		}
		public double getSalary()
		{
			//validation
			return salary;
		}
		public void setName(String name)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("ENter the Password: ");
			int upwd=sc.nextInt();
			if(pwd==upwd)
			{
				System.out.println("Validation is Successfull and name is Set!");
				this.name=name;
			}
			else
				System.out.println("INVALID PASSWORD!! NAME IS NOT SET!");
			
		}
		public void setId(int id)
		{
			//validation
			this.id=id;
		}
		public void setSalary(double salary)
		{
			//validation
			this.salary=salary;
		}
}