package initialization_By_Method_1;

public class EmployDriver {

	public static void main(String[] args) {
		
		Employ e1=new Employ();
		Employ e2=new Employ();
		Employ e3=new Employ();
		Employ e4=new Employ();
		e1.setValue("Mohan", 152, 346477.56);
		e2.setValue("Sohan", 431, 246877.56);
		e3.setValue("Rohan", 150, 546477.56);
		e4.setValue("ManMohan", 234, 446477.56);
		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
		e4.displayDetails();
	
	}
}
/*
 Name is: Mohan
ID is: 152
Salary is: 346477.56
==========================
Name is: Sohan
ID is: 431
Salary is: 246877.56
==========================
Name is: Rohan
ID is: 150
Salary is: 546477.56
==========================
Name is: ManMohan
ID is: 234
Salary is: 446477.56
==========================

 
*/