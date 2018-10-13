import java.util.Scanner;

public class Errors3	{

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int sum =0;

		System.out.println("This program divides two numbers.");
		String [] name = {"numerator", "denominator"};
		int [] arr = {1,2};
		for (int i =0; i<2; i++){ 
		System.out.print("Enter the " + name[i] + " :");
		arr[i] = kbd.nextInt();
		
		

		
		
		sum = arr[0] / arr[1];
		
		
		
	}         
		System.out.print (name[0] + " / " + name [1] + " = " + sum);
	        
		}
}