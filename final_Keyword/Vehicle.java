package final_Keyword;

public class Vehicle {

	
	final static int x=45;
	
	public static void main(String[] args) {
		
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle();
		Vehicle v3=new Vehicle();
		System.out.println(v1.x);
		System.out.println(v2.x);
		System.out.println(v3.x);
		//Vehicle.x=60;
		System.out.println("=================");
		System.out.println(v1.x);
		System.out.println(v2.x);
		System.out.println(v3.x);
	}
}
