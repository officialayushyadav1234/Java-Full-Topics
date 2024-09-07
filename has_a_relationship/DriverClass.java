package has_a_relationship;

public class DriverClass {

	public static void main(String [] args)
	{
		Mobile m1 = new Mobile("Nokia",1234,new Processor(4.6,6));
		
		System.out.println("Mobile Name is:" +m1.name);
		System.out.println("Mobile Price is:" +m1.price);
		System.out.println("Mobile Speed is:" +m1.p.speed+"GHZ");
		System.out.println("Mobile Processor Core is:" +m1.p.no_of_core);
		
		System.out.println("=============================");
		m1.displayMobile();
		System.out.println("=============================");
		
		Processor p1 = new Processor(4.6,10);
		Mobile m2 = new Mobile("Iphone",152433,p1);
		m2.displayMobile();
		m2=null;
		p1.displayProcessor();
		
		System.out.println("==============================");
		m1=null;
		System.out.println("=============================");
		
		m1.p.displayProcessor();
		
		System.out.println("Hello");
		System.out.println("Goog Morning!!");
		
	}
}
