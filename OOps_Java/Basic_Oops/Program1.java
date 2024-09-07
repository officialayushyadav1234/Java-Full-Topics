package Basic_Oops;

public class Program1 {

	public static void main(String[] args) {
		
		System.out.println("This is Program1");
		House h1=new House();
		System.out.println(h1.name);
		System.out.println(h1.address);
		h1.name="Shanti Kunj Sharma House";
		h1.address="B-4 Sector 35, NOIDA";
		System.out.println("Updated Details");
		System.out.println(h1.name);
		System.out.println(h1.address);

		h1.cookFood();
		h1.doCoding();
	}
}
/*
This is Program1
null
null
Updated Details
Shanti Kunj Sharma House
B-4 Sector 35, NOIDA
Cook Food in House
DO Coding in house

*/
