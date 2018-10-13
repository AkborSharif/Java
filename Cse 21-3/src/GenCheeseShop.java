import java.util.Random;
import java.util.Scanner;

public class GenCheeseShop {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);                                                               
	
		final int MAXCHEESE = 4;
		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];
		double discount = 0;
		int i =0;
		double subtotal = 0;
		
if (MAXCHEESE>0){
	  names[0] = "Dalaran Sharp";
		prices[0] = 1.25;
	}
	if (MAXCHEESE >1){
        names[1] = "Stormwind Brie";
		prices[1] = 10.00;
		}
	if (MAXCHEESE >2){
		names[2] = "Alterac Swiss";
		prices[2] = 40.00;
	}
 		System.out.println("We sell " + MAXCHEESE + " kinds of Cheese");
 		if (0<MAXCHEESE){
		System.out.println(names[0] + ": $" + prices[0] + " per pound");
 		}
		if (1<MAXCHEESE){	
		System.out.println(names[1] + ": $" + prices[1] + " per pound");
		}
		if (2<MAXCHEESE){
		System.out.println(names[2] + ": $" + prices[2] + " per pound");
		}
 		Random ranGen = new Random(100);

		for ( i = 3; i < MAXCHEESE; i++) {
			names[i] = "Cheese Type " + (char)('A'+i);
			prices[i] = ranGen.nextInt(1000)/100.0;
			amounts[i] = 0;

			System.out.println(names[i] + ": $" + prices[i] + " per pound");
		}
 
		
		
for ( i=0; i<MAXCHEESE; i++ ){
	   System.out.print("Enter the amount of " + names[i] + ": ");
	  amounts[i] = input.nextInt();
   }
                                                                        
for( i = 0; i < MAXCHEESE; i++) {
    subtotal += prices[i] * amounts[i];
}
if ( subtotal >= 100) 
		discount = 25;
	else if (subtotal>=50)
		discount = 10;
       System.out.print("Display the itemized list? (1 for yes) ");                   
              int itemized = input.nextInt();
              
		
          
         for ( i=0; i<MAXCHEESE; i++){                                                                     
   		if (itemized == 1 ){                                         
   			if (amounts[i]>0)       
   				System.out.println( amounts[i] + " lbs of " + names[i]+ " @ " + prices[i] + " = $" + prices[i]*amounts [i] );
			
		}
}
     System.out.println("");
	 System.out.println("Sub Total: $" + subtotal);
	 System.out.println("-Discount: $" + discount);
	 System.out.println("Total    : $" + (subtotal - discount));
   				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}