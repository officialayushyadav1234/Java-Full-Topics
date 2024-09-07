package constructor;

public class LaptopDriver {

	public static void main(String[] args) {
		
    Laptop l1 = new Laptop("HP",8,1024);
    Laptop l2 = new Laptop("Lenovo",8,256);
    Laptop l3 = new Laptop("HP",8,1024);
    Laptop l4 = new Laptop("DELL",16,1024);
    Laptop l5 = new Laptop("HP",8);
    Laptop l6 = new Laptop("HP");

    l1.displayDetails();
    l2.displayDetails();
    l3.displayDetails();
    l4.displayDetails();
    l5.displayDetails();
    l6.displayDetails();
    
	}

}
