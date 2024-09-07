package copy_constructor;

public class LaptopDriver {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop("HP",12,512,56225);
		Laptop l2 = new Laptop(l1);                //Copy Constructor
		
		l1.displaydetails();
		l2.displaydetails();
		
		Laptop l3 = new Laptop("DELL",8,1024,65120);
		Laptop l4 = new Laptop("Lenovo",8,256,52000);
		
		l3.displaydetails();
		Laptop l5 = new Laptop(l3);              //Copy Constructor
		l5.displaydetails();
		
		l4.displaydetails();
		Laptop l6 = new Laptop(l4);             //Copy Constructor
		l6.displaydetails();

	}

}
