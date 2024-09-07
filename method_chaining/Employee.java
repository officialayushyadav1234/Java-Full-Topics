package method_chaining;

public class Employee {

	String name;
	int eid;
	double salary;
	String address;
	
	Employee()
	{
		
	}
	
	Employee(String name,int eid,double salary,String address)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
		this.address=address;
	}
	
	public Employee getName()
	{
		System.out.println("Name is : " +name);
		return this;
	}
	
	public Employee getId()
	{
		System.out.println("Employ Id is :" +eid);
		return this;
	}
	
	public Employee getSalary()
	{
		System.out.println("Salary is: " +salary);
		return this;
	}
	
	public Employee getAddress()
	{
		System.out.println("Employ Add :" +address);
		return this;
	}
}
