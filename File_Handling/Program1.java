package File_Handling;

public class Program1 {

	public static void main(String[] args) {
		
		System.out.println("Program starts");
		System.out.println(10+30*3);
		try {
			System.out.println(10+30/0);
		}
		catch(Exception e) {
			System.out.println("Divided by 0 so result is Infinity");
		}
		System.out.println(34+40*5);
		System.out.println("Program ends");
	}
}
