import java.io.*;
class DecimalFraction
{
  public static void main (String[] args) throws IOException
  {
    float x = 1.0f;
    float y = 10.0f;
    
    if ( x/y == 0.1 )
      System.out.println("Buy the cookie!"  );
    else
      System.out.println("No cookie for you.");
  }
}
