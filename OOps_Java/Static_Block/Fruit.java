package Static_Block;

public class Fruit {

	{
		System.out.println("This is non-static block-1");
	}
	static{
		System.out.println("This is static block-1");
	}
	public static void main(String[] args)
	{
		System.out.println("This is main method of Fruit");
		Fruit f1=new Fruit();
		System.out.println("==================");
		Fruit f2=new Fruit();
		System.out.println("==================");
		Fruit f3=new Fruit();
	}
	{
		System.out.println("This is non-static block-2");
	}
}
