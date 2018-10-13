import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int max = 5;
		int [] array = new int [max];
		int element = 0;
	
		for(int i = 1; i<max; i++){
			System.out.print("value "+ i + ": " );
			array [i] = input.nextInt();
			}
		System.out.println("The array: ");
		for(int i = max-1; i > 0; i--){
			  element = array[i];
		System.out.println("This is a quote \"hi\"");
			  System.out.print(element + " ");
		} 
	} 

}
