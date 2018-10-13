package summer;

import java.util.Scanner;
public class Anyavg {

	
		public static void main(String[]args){
			Scanner scan = new Scanner (System.in);
			int sum = 0;
			System.out.print( "enter the max: ");
			int max = scan.nextInt();
			
			
			int array [] = new int [max];
			int count = 0;
			int i;
			
for (i=0; count<max; i++){
	System.out.print("enter " + count + " number: ");
    array [i] = scan.nextInt();
	sum +=  array [i];
	count ++;
		 }
System.out.println("The numbers being averaged: ");
for (i = 0; i < max; ++i) {
	System.out.print(array[i] + " ");
	if (i % 5 == 4) {
		System.out.print("\n");
	}
}

System.out.println(" ");
System.out.println("Average is : " + (sum/max));


scan.close();
}

}
