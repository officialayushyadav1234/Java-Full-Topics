package File_Handling;
import java.io.*;
import java.util.*;
// File writing operation

public class Program6 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		File f1=new File("f:\\ijk.txt");
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(f1);
			System.out.println("File is created and now u can write into it");
			byte[] x= {100, 97, 98, 99, 103, 106, 105};
			fos.write(x);
			byte[] y= {65,66,67,68,69,70,71,72};
			fos.write(y,2,4);
			String s1="Mohan is here";
			fos.write(("\n"+s1).getBytes());
			System.out.println("ENter the String: ");
			String s2=sc.nextLine();
			fos.write(("\n"+s2).getBytes());
		} catch (FileNotFoundException e) {
			System.out.println("File is not created");
		}
		finally {
			fos.close();	
		}
		System.out.println("====program ends====");
	}
}
