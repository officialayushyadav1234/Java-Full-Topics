package initialization_By_Method_1;

public class Employ {

	String name;
	int id;
	double salary;
	public void setValue(String name, int id, double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void displayDetails()
	{
		System.out.println("Name is: "+name);
		System.out.println("ID is: "+id);
		System.out.println("Salary is: "+salary);
		System.out.println("==========================");
    }
}
