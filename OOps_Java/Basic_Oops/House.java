package Basic_Oops;

public class House {

		String name;
		String address;
		public void cookFood()
		{
			System.out.println("Cook Food in House");
		}
		public void doCoding()
		{
			System.out.println("DO Coding in house");
		}
		public static void main(String[] args)
		{
			System.out.println("This is House Class");
			House h1=new House();
			System.out.println(h1.name);
			System.out.println(h1.address);
			h1.cookFood();
			h1.doCoding();	
		}
}
/*
 This is House Class
null
null
Cook Food in House
DO Coding in house

 */
