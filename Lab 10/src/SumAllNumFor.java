import java.util.Scanner;

public class SumAllNumFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int sum = 0;
		
		for (int i = 0; i <= max; i++) {
			System.out.println("Number " + i);
			sum += i ;
			
		}
		System.out.println("Sum is: " + sum);
	}
}
