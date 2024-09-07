package inheritance;

public class Driver {

	public static void main(String[] args) {
		
		Car c1=new Car("TATA", "White", 325346, 120, 6);
		Car c2=new Car("Maruti", "Black", 425346, 140, 6);
		Car c3=new Car("Audi", "Red", 5325346, 180, 8);
		Vehicle v1=new Vehicle("Cycle", "Green", 23435);
		c1.getCarDetails();
		c2.getCarDetails();
		c3.getCarDetails();
		v1.getVehicledetails();
	}	
	
}

/*
Name is: TATA
Color is: White
Price is: 325346
HP is: 120
Strokes is: 6
======================
Name is: Maruti
Color is: Black
Price is: 425346
HP is: 140
Strokes is: 6
======================
Name is: Audi
Color is: Red
Price is: 5325346
HP is: 180
Strokes is: 8
======================
Name is: Cycle
Color is: Green
Price is: 23435

 
*/