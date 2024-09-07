package has_a_relationship;

public class Mobile {

	String name;
	int price;
	Processor p;
	
	Mobile()
	{
		
	}
	
	Mobile(String name,int price,Processor p)
	{
		this.name=name;
		this.price=price;
		this.p=p;
	}
	
	public void displayMobile()
	{
		System.out.println("Name is: " +name);
		System.out.println("Price is: " +price);
		p.displayProcessor();
	}
}













