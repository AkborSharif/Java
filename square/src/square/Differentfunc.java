package square;

import java.util.Scanner;

public class Differentfunc {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		
		System.out.println("This programme finds out the sum of 4 functions ");
		
		System.out.println("\t1.SumAll\t2.Sumsquare\t3.Factorial\t4.Fibonacci");
		while (true){
			System.out.println("Chose the function: ");
		    int func = input.nextInt();

			System.out.print("Enter the max: ");
			int max = input.nextInt();
			int [] arr = new int [max+2];
			
		
			for (int i = 1; i <= max; i++ ) {
				if (func == 1) {
					arr[i] = arr[i-1] + i;
				} else if (func == 2) {
					arr[i] = arr[i-1] + i*i;
				} else if (func == 3) {
					if (i == 1)
						arr[i] = 1;
					else
						arr[i] = arr[i-1] * i;
				} else if (func == 4) {
					if (i == 1)
						arr[i] = 1;
					else
						arr[i] = arr[i-1] + arr[i-2];
				} else {
					System.out.println("Error: Do not know " + func);
					break;
				}
			}
			  System.out.println("Do you want to repeat the func:(enter 1 for yes) ");
			   if (input.nextInt()==1){
				   continue;	   
			   }
			   System.out.println("Do you want to print out the values: (Enter 1 for yes)");
			   if (input.nextInt()==1){
				   System.out.println("\tIndex\tvalue");
				   for(int i=0; i<=max;i++){
				   System.out.println("\t"+i+"\t" + arr[i] );
				   }
			   }
				   
				   System.out.println("Do you want to finish the progarame: (1 for yes)");
				   if (input.nextInt()==1){
					   break;
				   }
			        else {
			        	continue;
	              }
	          }
	      }
       }
