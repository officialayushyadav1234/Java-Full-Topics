package Exception_Eclipse_Program;

public class CalculatorDriver {

	public static void main(String[] args) {
		
		double x=12.5;
		double y=0;
		
		try {
			Calculator.divide(x, y);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("program ends!!");
		}
	}
	
}
