package File_Handling;
import java.io.*;
import java.util.*;
// File Writing Operation

public class Program5 {

	public static void main(String[] args) throws IOException {
		
	File f1=new File("f:\\cde.txt");
	FileOutputStream fos=null;
	try {
		fos=new FileOutputStream(f1);
		System.out.println("File is created and now u can write into it");
		fos.write(65);
		fos.write('B');
		fos.write("abc".getBytes());
	} catch (FileNotFoundException e) {
		System.out.println("File is not created");
	}
	finally {
		fos.close();	
	}
	System.out.println("====program ends====");
    }
}
