package final_Keyword;

public class Driver {

	public static void main(String[] args) {
		
		Laptop l1=new Laptop(128);
		l1.brand="hp";
		System.out.println(l1.brand);
		System.out.println(l1.hd);
		System.out.println(l1.price);
		
		Laptop l2=new Laptop("Dell", 512);
	}
}
