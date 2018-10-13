import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int sum = 0;
		int i = 0;
		int num = 0;
		int avg = 0;
		
		do {
		System.out.print("Number " + i + " number: ");
		num = scnr.nextInt();
		if (num <= 0) 
			break;
		
		i += 1;
		sum = sum + num;
	} while ( num > 0);
		avg = sum/i;
	System.out.println("Average is: " + avg);

	}

}
