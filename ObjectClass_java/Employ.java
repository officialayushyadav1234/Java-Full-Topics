package ObjectClass_java;

public class Employ {

	String name;
	int id;
	double salary;
	Employ()
	{
		
	}
	Employ(String name, int id, double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	@Override
	public String toString()
	{
		return "Name is: "+name+" ID is: "+id+" Salary is: "+salary;
	}
	public int hashCode()
	{
		return id;
	}
	@Override
	public boolean equals(Object obj)
	{
		Employ e=(Employ)obj;
	return this.name.equals(e.name) && this.id==e.id && this.salary==e.salary;
	}
	public void finalize()
	{
		System.out.println("detach system connection");
		System.out.println("detach database connection");
		System.out.println("detach network connection");
		System.out.println("===========================");
    }
}
