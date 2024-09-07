package while_Loop_Questions;

public class Program10 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		int i=1;
		int count=0;
		while(i<=1000)
		{
			if(i%7==0 && i%10==7)
			{
				System.out.println(i);
				count++;
			}
		i++;
		}
		
		System.out.println("Total Such Numbers are: "+count);
	}
}
