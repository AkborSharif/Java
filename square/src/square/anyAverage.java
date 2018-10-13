package square;

import java.util.Scanner;

public class anyAverage {
	public static void main (String [] args){
		int count;
		int recount = 0;
		int total = 0;
		Scanner scan = new Scanner (System.in);
		System.out.print("please choose the amount of nums: ");
        count  = scan.nextInt();
        
        recount = count;
        
        
        while (recount >0){
        	System.out.print("Enter the " + (count-recount) + " number: ");
        	int num = scan.nextInt();
        	total += num;
        	recount --;
        } System.out.println("the average is: " + total/count);
		
		
		
	}
	
}
