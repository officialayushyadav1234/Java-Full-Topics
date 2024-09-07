package Static_Block;

public class Program1 {

	static int x=23;
	static int y;
	static{
		System.out.println("This is static block-1 "+x+"  "+y);
		x=68;
		int y=90;
		System.out.println(x+"  "+y);
	}
	public static void main(String[] args){
		System.out.println("This is main method: "+x+"  "+y);
	}
	static{
		System.out.println("This is static block-2 "+x+"  "+y);
		y=88;
		int x=123;
		System.out.println(x+"  "+y);
	}
}
