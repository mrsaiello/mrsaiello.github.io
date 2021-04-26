import java.io.*;
class CookieDecision
{
  public static void main (String[] args) throws IOException
  {
    String charData;
    int hunger, look, smell ;
    BufferedReader stdin = new BufferedReader 
        ( new InputStreamReader( System.in ) );

    System.out.println("How hungry are you            (1-10):");
    charData = stdin.readLine();
    hunger   = Integer.parseInt( charData );

    System.out.println("How nice does the cookie look (1-10):");
    charData = stdin.readLine();
    look     = Integer.parseInt( charData );

    System.out.println("How nice does the cookie smell (1-10):");
    charData = stdin.readLine();
    smell    = Integer.parseInt( charData );

    if ( (hunger + look + smell ) > 15 )
      System.out.println("Buy the cookie!"  );

    System.out.println("Continue down the Mall.");
  }
}
