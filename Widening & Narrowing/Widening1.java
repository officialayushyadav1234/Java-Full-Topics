class Widening1
{
 public static void main(String[]args)
{
 int x=20;
 double y=x;
 System.out.println(x);    // Output-> 20
 System.out.println(y);    // Output-> 20.0
 
 System.out.println("------------------------------");
 
 char c='@';
 int p=c;
 System.out.println(c);    // Output-> @
 System.out.println(p);    // Output-> 64 (ASCII VALUE)
}
}