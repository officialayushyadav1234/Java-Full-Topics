class ByteRangeAdd
{
 public static void main(String[]args)
{
  byte x=30;
  byte y=40;
  byte z= (byte)(x+y);
  System.out.println(z);  // Output-> 70
  
  System.out.println("------------------------");

  byte a=50;
  byte b=30;
  byte c=52;
  byte res= (byte)(a+b+c);
  System.out.println(res);  // Output-> -124

  byte m=124;
  byte n=56;
  byte o=(byte)(m+n);
  System.out.println(o);    // Output-> -76
 }
}