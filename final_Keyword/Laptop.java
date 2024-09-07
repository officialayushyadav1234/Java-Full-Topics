package final_Keyword;

public class Laptop {

	String brand;
	final  int hd;
	double price;
	
	Laptop(int hd){
		this.hd=hd;
	}
	Laptop(String brand, int hd){
		this.brand=brand;
		this.hd=hd;
	}
	Laptop(String brand, double price, int hd){
		this.brand=brand;
		this.price=price;
		this.hd=hd;
	}
}
