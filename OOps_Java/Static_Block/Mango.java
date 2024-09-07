package Static_Block;

public class Mango {

	{
		System.out.println("This is non-static block-1");
	}

	public static void main(String[] args)
	{
		System.out.println("This is main method of Fruit");
		Mango m1=new Mango();
	}

	{
		System.out.println("This is non-static block-2");
		Mango m1=new Mango();
	}
}
