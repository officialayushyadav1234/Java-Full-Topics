package method_overloading;

public class MainMethodOverload {

   public static void main(String[] args)
   {
	   System.out.println("Main with String[] args");
	   main(45.2);
	   main(12);
	   main('a');
	   main("Ayush");
   }
   
   public static void main(int args)
   {
	   System.out.println("Main with int args");
	   
   }
   
   public static void main(double args)
   {
	   System.out.println("Main with double args");
   }
   
   public static void main(char args)
   {
	   System.out.println("Main with char args");
   }
   
   public static void main(String args)
   {
	   System.out.println("Main with String args");
   }
   
}
