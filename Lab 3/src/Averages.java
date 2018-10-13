import java.util.Scanner;

public class Averages
{
	public static void main(String[] args)
	{
		System.out.println("This program will ask the user for two numbers, and will calculate the average of those numbers");

		Scanner input = new Scanner(System.in);
		int sum=0;
		double average =0;
         String [] arr = {"first", "second"};
		double[] n = {1,2};
for (int i = 0; i<2; i++ ){
		System.out.print("Please enter the " +  arr[i] +" number:");
		n[i] = input.nextInt();
		sum += n[i];
		average = sum/2;
		
} System.out.print("The average of the numbers is " + average);
		

		
		
		
		
	}
}
	
