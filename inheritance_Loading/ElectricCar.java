package inheritance_Loading;

public class ElectricCar extends Car{

	ElectricCar(){
		System.out.println("ElectricCar constructor");
	}
	{
		System.out.println("ElectricCar Non-static block");
	}
	
	static
	{
		System.out.println("ElectricCarCar static block");
	}
}
