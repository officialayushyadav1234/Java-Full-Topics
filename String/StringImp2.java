import java.util.Scanner;
class StringImp2
{
 public static void main(String []args)
 {
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter the Name :");
  String name=sc.nextLine();
  System.out.println("Enter the Age :");
  int age=sc.nextInt();
  System.out.println("Enter the Address :");
   
  // for print the cursor-----------------------------
  sc.nextLine();
                                       
  String add=sc.nextLine();
  // ------------------------------------------------

  System.out.println("Enter the School name :"); 
  String sch = sc.nextLine();
  System.out.println("Enter the Email id :"); 
  String email =sc.nextLine();
  System.out.println("Enter the Weight :");
  float weight= sc.nextFloat();
  System.out.println("Enter the Mobile No. :"); 
  long mobno =sc.nextLong();
     
  // for the Display Program -------------------------
  System.out.println("Name is :"+name);
  System.out.println("Age is :"+age+ "Year");
  System.out.println("Add is :"+add);
  System.out.println("School is :"+sch);
  System.out.println("Email is :"+email+ "@gamail.com");
  System.out.println("Weight is :"+weight+ "KG");
  System.out.println("Mob.no is 91-"+mobno);
 }
}
  
  



