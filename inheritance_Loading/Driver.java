package inheritance_Loading;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Main starts!");
		ElectricCar e1=new ElectricCar();
		System.out.println(e1.x);
		System.out.println("Main ends!!");
	}
}

/*
Main starts!
Vehicle static block
Car static block
ElectricCarCar static block
Vehicle Non-static block
Vehicle constructor
Car Non-static block
Car constructor
ElectricCar Non-static block
ElectricCar constructor
30
Main ends!!

*/