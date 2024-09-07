package File_Handling;
import java.io.*;
import java.util.*;
// File writing operation

public class Program4 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		FileWriter fw=null;
		try {
			fw=new FileWriter("F:\\important.txt");
			System.out.println("File is created!");
			fw.write("Mohan is eating");
			System.out.println("Plese write your biodata: ");
			String s1=sc.nextLine();
			fw.write(s1);
		}
		catch(Exception e) {
			System.out.println("File is not created!!");
		}
		finally {
			fw.close();
		}
		System.out.println("Program ends!!");
	}
}
