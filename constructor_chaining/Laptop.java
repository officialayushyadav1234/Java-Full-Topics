package constructor_chaining;

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
	
	Laptop(String brand, int ram)
	{
		this(brand);
		this.ram=ram;
	}
	
	Laptop(String brand, int ram, int hd)
	{
       this(brand,ram);
       this.hd=hd;
	}
	
	Laptop(String brand,int ram,int hd, double price)
	{
		this(brand, ram, hd);
		this.price=price;
	}
	
	public void displayDetails()
	{
	System.out.println("Brand is : "+brand);
	System.out.println("Ram is : "+ram+ "GB");
	System.out.println("Brand is : "+hd+ "GB");
	System.out.println("Brand is : "+price+"Rupees");
	System.out.println("================================");
  }
}



