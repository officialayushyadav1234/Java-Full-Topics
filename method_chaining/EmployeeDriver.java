package method_chaining;

public class EmployeeDriver {

	public static void main(String[] args)
	{
		Employee e1 = new Employee("Ayush",241,75000.32,"Noida");
		Employee e2 = new Employee("Aman",235,71000.15,"Lucknow");
		Employee e3 = new Employee("Sanagam",231,65000.35,"Delhi");
		Employee e4 = new Employee("Harshit",211,55000.24,"GZB");
		
		// Method chaining
		e1.getName().getId().getSalary().getAddress();
		System.out.println("==================");
		
		e2.getName().getSalary();
		System.out.println("======================");
		
		e3.getName().getId().getSalary().getAddress();
		System.out.println("==================================");
		
		e4.getName().getSalary();
		System.out.println("===================================");
		
	}
}
