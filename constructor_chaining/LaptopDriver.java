package constructor_chaining;

public class LaptopDriver {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop("HP",8,6,65000);
		Laptop l2 = new Laptop("DELL",8,8,70000);
		Laptop l3 = new Laptop("Lenovo",8,256,65000);

		l1.displayDetails();
		l2.displayDetails();
		l3.displayDetails();
	}

}
