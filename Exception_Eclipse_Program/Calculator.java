package Exception_Eclipse_Program;
import java.io.*;

public class Calculator {

	public static void divide(double a, double b)throws FileNotFoundException
	{
		if(b!=0)
			System.out.println(a+"/"+b+"= "+a/b);
		else
			throw new ArithmeticException("Divided by Zero!Infinity");
	}
}
