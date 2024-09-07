package this_keyword;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		System.out.println(c1);
		c1.test();
		System.out.println("====================");
		System.out.println(c2);
		c2.test();
		System.out.println("====================");
		System.out.println(c3);
		c3.test();
		System.out.println("====================");	
	}
}
/*
this_keyword.Car@4517d9a3
this_keyword.Car@4517d9a3
====================
this_keyword.Car@372f7a8d
this_keyword.Car@372f7a8d
====================
this_keyword.Car@2f92e0f4
this_keyword.Car@2f92e0f4
====================

 
*/