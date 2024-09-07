package method_overloading;

public class CalculatorDriver {

	public static void main(String[] args)
	{
		Calculator.add(85, 60);
		System.out.println("==============");
		
		Calculator.add(25.8, 60);
		System.out.println("==============");
		
		Calculator.add(254.9, 65.7);
		System.out.println("==============");
		
		Calculator.add(85, 60, 85);
		System.out.println("==============");
		
		Calculator.add(85.4, 60.5, 54.8);
		System.out.println("==============");
	}
}
