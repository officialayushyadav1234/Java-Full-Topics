class Narrowing1
{
 public static void main(String[]args)
{
 double x=203.56;
// int y=x;                -> Error incompletable types

 int y = (int)x;
 System.out.println(x);    // Output-> 203.56
 System.out.println(y);    // Output-> 203
 
 System.out.println("------------------------------");
 
 int c=372;
// char p=c;               -> Error incompletable types

 char p = (char)c;
 System.out.println(c);    // Output-> 372
 System.out.println(p);    // Output-> ?
}
}