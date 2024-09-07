import java.util.Scanner;
class StringImp1
{
 public static void main(String []args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Name :");
  String name=sc.nextLine();
  System.out.println("Enter the Age :");
  int age=sc.nextInt();
  System.out.println("Enter the Mobile No. :"); 
  long mobno =sc.nextLong();
  System.out.println("Enter the Weight :");
  float weight= sc.nextFloat();

  System.out.println("Name is :"+name);
  System.out.println("Age is :"+age+"Year");
  System.out.println("Mob.no is :"+mobno);
  System.out.println("Weight is :"+weight+"KG");
 }
}
  
  



