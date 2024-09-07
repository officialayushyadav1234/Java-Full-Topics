import java.util.Scanner;
class SimpleProgram2
{
 public static void main(String []args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the First Number:");
  double a = sc.nextDouble();
 
  System.out.println("Enter the Second Number:");
  double b = sc.nextDouble();
 
  double sum = a+b;
  System.out.println("Enter the Sum of "+a+" and "+b+" is:"+sum);
}
}  