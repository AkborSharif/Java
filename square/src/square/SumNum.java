package square;

import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
	System.out.print("enter the max: ");
	int max = input.nextInt();
	int sum = 0;
		for (int i = 0; i<= max; i++){
			System.out.println("number: " + i);
			sum +=i;
		 
		}System.out.println("sum: "+  sum);
	}

}
