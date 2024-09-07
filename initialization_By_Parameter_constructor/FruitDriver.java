package initialization_By_Parameter_constructor;

public class FruitDriver {

	public static void main(String[] args) {
		
		Fruit f1=new Fruit("Mango", 110, 3.5);
		Fruit f2=new Fruit();
		Fruit f3=new Fruit();
		Fruit f4=new Fruit("Apple");
		Fruit f5=new Fruit("Orange", 80);
		
		f1.getDetails();
		f2.getDetails();
		f3.getDetails();
		f4.getDetails();
		f5.getDetails();
	
	}
}

/*
Name is: Mango
Price is: 110
Weight is: 3.5
=================
Name is: null
Price is: 0
Weight is: 0.0
=================
Name is: null
Price is: 0
Weight is: 0.0
=================
Name is: Apple
Price is: 0
Weight is: 0.0
=================
Name is: Orange
Price is: 80
Weight is: 0.0
=================
 
*/