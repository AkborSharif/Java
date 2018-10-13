
import java.util.Scanner;

public class ImportTest {
   public static void main (String [] args) {
      char letterToQuit = '?';
      int  numPresses   = 0;
      String fruitColor = "";
      
      Scanner scnr = new Scanner(System.in);

      System.out.println("Press the " + letterToQuit + " key " + numPresses + " times to quit.");
      
      System.out.println( "Enter fruit color:"); 
      fruitColor = scnr.next();
      
      System.out.println(fruitColor);

      return;
   }
}