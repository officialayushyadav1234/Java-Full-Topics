package initialization_By_non_static_Method;

public class FruitDriver {

	public static void main(String[] args) {
		
		Fruit f1=new Fruit();
		Fruit f2=new Fruit();
		Fruit f3=new Fruit();

		f1.setValue("Mango", 110, 3.5);
		f2.setValue("Apple", 180, 5.5);
		f3.setValue("Orange", 70, 2.3);
		
		f1.getDetails();
		f2.getDetails();
		f3.getDetails();
	}
}

/*
Name is: Mango
Price is: 110
Weight is: 3.5
=================
Name is: Apple
Price is: 180
Weight is: 5.5
=================
Name is: Orange
Price is: 70
Weight is: 2.3
=================

*/