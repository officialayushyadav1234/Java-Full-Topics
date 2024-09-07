package Static_Block;

public class Program2 {

	static int x=23;
	static int y;
	static{
		System.out.println("This is static block-1 "+x+"  "+y);
		x=68;
		y=test();
		System.out.println(x+"  "+y);
	}
	public static void main(String[] args){
		System.out.println("This is main method: "+x+"  "+y);
	}
	public static int test()
	{
		System.out.println("This is test method "+x+"  "+y);
		y=56;
		int x=90;
		System.out.println(x+"  "+y);
	return x+20;
	}
}
