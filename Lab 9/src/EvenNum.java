import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the max number:");
		
		int max = input.nextInt();
		int i = 0;
		while (i <= max) {
			System.out.println("Number " + i);
			i = i+2;
		}
		

	}

}
