package Static_Block;

public class Car {

	static int x;
	static
	{
		System.out.println("This is static block-1");
		x=34;
	}
	
	public static void main(String[] args)
	{
		System.out.println("This is main method");
	}

	static
	{
		System.out.println("This is static block-2");
	}
}
