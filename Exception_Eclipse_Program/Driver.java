package Exception_Eclipse_Program;

public class Driver {

	public static void main(String[] args) {
		
		try {
			FileReadingProgram.checkFile();
			
		}catch(Exception e)
		{
			System.out.println("File NOT created!");
		}
	}
}
