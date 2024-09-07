package method;

public class Fact {

  public static  void main(String[] args)
   {
	 int x = 6;
	 int fact = findFactorial(x);
	 System.out.println("From main " +x+ "!=" +fact);
   }
  
  public static int findFactorial(int n)
  {
	  int fact = 1;
	  for(int i=1 ; i<=n ; i++)
	  {
		  fact = fact*i;
	  }
	  System.out.println(n+ "!=" +fact);
	  return fact;
  }
}
