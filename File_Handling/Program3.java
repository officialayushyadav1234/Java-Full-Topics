package File_Handling;
import java.io.*;

public class Program3 {

	public static void main(String[] args) {
		
        File f1=new File("f:\\");        // Show all details of F: drive
		
		File[] x=f1.listFiles();
		for(File p:x)
			System.out.println(p);
	}
}
