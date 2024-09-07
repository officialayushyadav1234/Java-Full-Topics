package File_Handling;
import java.io.*;
// Read Statement in file

public class Program9 {

	public static void main(String[] args) {
		
		File f1=new File("f:\\Program1.java");
		try {
			FileInputStream fis=new FileInputStream(f1);
			int x=fis.read();
			while(x!=-1) {
				System.out.print((char)x);
				x=fis.read();
			}
		} catch (Exception e) {
			System.out.println("File is not found");
		}	
	}
}
