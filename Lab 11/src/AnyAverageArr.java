import java.util.Scanner;
public class AnyAverageArr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int max, i;
		int count = 0;
		int sum = 0;

		System.out.println("This program will find the average of any numbers");
		System.out.print("Please choose the amount of numbers to average: ");
		max = input.nextInt();

		int[] arr = new int [max+1];

		for (i = 0; count < max; i++){
		System.out.print("Please enter " + count + " number: ");
		arr[i] = input.nextInt();
		sum += arr[i];
		count++;
		}

		System.out.println("The numbers being averaged: ");
		for (i = 0; i < max; ++i) {
			System.out.print(arr[i] + " ");
			if (i % 5 == 4) {
				System.out.print("\n");
			}
		}
		
		System.out.println(" ");
		System.out.println("Average is : " + (sum/max));
		
		
		input.close();
	}

}
