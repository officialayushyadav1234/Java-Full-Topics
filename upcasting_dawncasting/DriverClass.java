package upcasting_dawncasting;

public class DriverClass {

	public static void main(String[] args)
	{
		Object o1 = new ElectricCar();
		Vehicle v1 = (Vehicle)o1;
		
		System.out.println(v1.a);
		System.out.println(v1.b);
		
		System.out.println("=========================");
		
		Car c1 = (Car)v1;
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		
		System.out.println("==========================");
	
	    ElectricCar e1 = (ElectricCar)o1;	
	}
}
