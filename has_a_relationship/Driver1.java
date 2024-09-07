package has_a_relationship;

public class Driver1 {

	public static void main(String[] args)
	{
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		Mobile m3 = new Mobile();
		
		System.out.println("M1 is : "+m1);
		System.out.println("M2 is : "+m2);
		System.out.println("M3 is : "+m3);
		
		System.out.println("===================");
		
		m1=null;
		m2=m3;
		System.out.println("M1 is : "+m1);
		System.out.println("M2 is : "+m2);
		System.out.println("M3 is : "+m3);
	}
}
