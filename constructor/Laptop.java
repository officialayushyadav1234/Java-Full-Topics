package constructor;

public class Laptop {

	String brand;
	int ram;
	int hd;
	Laptop()
	{
		
	}
	
	Laptop(String brand)
	{
		this.brand=brand;
	}
	
	Laptop(String brand, int hd)
	{
		this.brand=brand;
		this.hd=hd;
	}
	
	Laptop(String brand, int hd, int ram)
	{
		this.brand=brand;
		this.hd=hd;
		this.ram=ram;
	}
	
	public void displayDetails()
	{
		System.out.println("Brand is: " +brand);
		System.out.println("Ram is: " +ram+ "GB");
		System.out.println("Hd is: " +hd+ "GB");
		System.out.println("==============================");
	}
	
}
