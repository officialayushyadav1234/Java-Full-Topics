package final_Keyword;

public class Car {

	final static int x;
	static
	{
		x=34;
	}
	
	public static void main(String[] args) {
		Car c1=new Car();
		System.out.println(c1.x);
		
	}
}
