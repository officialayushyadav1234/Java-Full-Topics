package Exception_Eclipse_Program;

public class Registration {

	public static void checkEligiblity(int age) throws UnderAgeException
	{
		if(age>=18)
		{
			System.out.println("You are Eligible to register!");
		}
		else
		{
			throw new UnderAgeException();
		}
    }
}
