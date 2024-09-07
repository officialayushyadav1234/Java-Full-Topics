package while_Loop_Questions;

public class Program9 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		int i=1;
		int count=0;
		while(i<=100)
		{
			if(i%6==0)
				count++;
		i++;
		}
		
		System.out.println("Total Count is: "+count);
	}
}
