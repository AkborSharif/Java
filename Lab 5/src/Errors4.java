import java.util.Scanner;

public class Errors4 {

	public static void main(String[] args) {

		int n1, n2;

		Scanner keyboard;

		System.out.println("Enter two ints and we print out sum as an int.");

	     keyboard = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		n1 = keyboard.nextInt();
		System.out.print("Enter the second number: ");
		n2 = keyboard.nextInt();
		
		System.out.println(""); //Space

		System.out.println("The sum of the numbers is " + (double)(n1+n2));
		
	}

}