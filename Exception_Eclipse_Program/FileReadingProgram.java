package Exception_Eclipse_Program;

import java.io.File;
import java.io.IOException;

public class FileReadingProgram {

	public static void checkFile()throws IOException 
	{
		int x=-3;
		if(x>0)
		{
			System.out.println("x is greater than 0");
		}
		else
		{
			File f1=new File("f:\\Ayush.txt");
			throw new IOException();
		}
	}
}
