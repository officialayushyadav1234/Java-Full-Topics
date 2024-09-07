package File_Handling;
import java.io.*;
import java.util.*;

public class Program7 {

	public static void main(String[] args) {
		
		File f1=new File("f:\\demo.java");
		Scanner sc=null;
		try {
			sc=new Scanner(f1);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File is NOT Found!!");
		}
		finally {
			sc.close();
		}
	}
}
