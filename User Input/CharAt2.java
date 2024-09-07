import java.util.Scanner;
class CharAt2
{
 public static void main(String []args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the String : ");
  char x = sc.next().charAt(5);
  System.out.println("Character is :"+x);
}
}