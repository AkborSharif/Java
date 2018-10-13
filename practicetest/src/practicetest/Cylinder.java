package practicetest;

import java.util.*;
public class Cylinder {  
      public static void main(String[] args) {
       double pi = 3.14 ;
     Scanner kbd = new Scanner(System.in);

 Double radius, height, area, volume;
 System.out.print ("Enter Radius: ");
  radius = kbd.nextDouble();
   System.out.print("Enter Height: ");
    height = kbd.nextDouble();


area = 2*pi*radius*radius    + 2*pi*radius*height;
volume = pi*radius*radius*height;
System.out.print("Cylinder Area"  + area );
System.out.print("Cylinder Volume "  + volume );

}
}


	 




