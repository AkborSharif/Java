package square;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[]args){
		Scanner input = new Scanner (System.in);
		System.out.println("The programe gives you the sum of the fibonacci numbers.");
		
		System.out.print("Enter the Max: ");
		int max = input.nextInt();
		int [] Arr = new int [max+2];
		
		for (int i =1; i<= max; i++){
			if (i == 1){
				Arr[i] =1;
			}else {
			Arr[i] = Arr[i-1] + Arr[i-2];
			}
		}
		System.out.println("\tindex\tValue" );
		
		for (int i =0; i<= max; i++){
			System.out.println("\t" + i + "\t" + Arr[i]);
		}
	
	}
}

