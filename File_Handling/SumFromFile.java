package File_Handling;
import java.io.*;

public class SumFromFile {

	public static void main(String[] args) {
		
		File f1=new File("f:\\mohan.txt");
		int sum=0;
		try {
			FileInputStream fis=new FileInputStream(f1);
			int x=fis.read();
			while(x!=-1) {
				if(x>=48 && x<=57)
						sum=sum+x-48;
			x=fis.read();
			}
		} catch (Exception e) {
			System.out.println("File is not found");
		}
		System.out.println("Total Sum is: "+sum);
	}
}
