import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Please enter the max number:");
		int max = scnr.nextInt();
		
		System.out.print("Enter the base:");
		int base = scnr.nextInt();
		
		for (int i = base; i <= max; i += base) {
			System.out.println("Number " + i);
		}

	}

}
