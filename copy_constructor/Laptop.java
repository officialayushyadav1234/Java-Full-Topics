package copy_constructor;

//import constructor_chaining.Laptop;

public class Laptop {

	String brand;
	int ram;
	int hd;
	double price;
	
	Laptop()
	{
		System.out.println("Laptop Object is Created");
	}
	
	Laptop(String brand)
	{
		this();
		this.brand=brand;
	}
	Laptop(String brand,int ram)
	{
		this(brand);
		this.ram=ram;
	}
	Laptop(String brand, int ram,int hd)
	{
		this(brand,ram);
		this.hd=hd;
	}
	Laptop(String brand, int ram,int hd,double price)
	{
		this(brand,ram,hd);
		this.price=price;
	}
	
	// Copy Constructor
	Laptop (Laptop x)                
	{
		this.brand=x.brand;
		this.ram=x.ram;
		this.hd=x.hd;
		this.price=x.price;
	}
	
	public void displaydetails()
	{
		System.out.println("Brand is :"+brand);
		System.out.println("Ram is :"+ram+"GB");
		System.out.println("Brand is :"+hd+"GB");
		System.out.println("Brand is :"+price+" Rupees");
		System.out.println("=================================");
	}
}
