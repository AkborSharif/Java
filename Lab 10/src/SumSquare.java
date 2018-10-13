          import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int max = 0;
		int sum = 0;
		int i = 1;
		int squared = 0;
		
		System.out.print("Please enter the max number: ");
		max = scnr.nextInt();
		
		do {
			System.out.print("Number " + i);
			squared = i*i;
			System.out.println(" squared is " + squared);
			i++;
			sum = sum + squared;
		} while (i <= max);
		System.out.println("Sum of square is: " + sum);

	}

}
