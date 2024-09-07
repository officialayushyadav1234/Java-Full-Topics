package do_while_Loop;

public class Program1 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		int i=1;
		do
		{
			System.out.println("Loop Body: "+i);
			i++;
		}while(i>=100);
		System.out.println("It Ends");
	}
}

// Output --->  Program Starts
//              Loop Body: 1
//              It Ends 