package File_Handling;
import java.io.*;

public class Program8 {

	public static void main(String[] args) {
		
		try {
			FileReader fr=new FileReader("f:\\program1.java");
			int x=fr.read();
			while(x!=-1) {
				System.out.print((char)x);
				x=fr.read();
			}
		} catch (IOException e) {
			System.out.println("File Not Found!");
		}
		
	}
}
