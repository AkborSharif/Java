import java.util.Scanner;

public class CheeseShop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);                                                              // Scanner input = new Scanner (System.in); 
		System.out.println ("We sell 3 kinds of Cheese");
	 String [] name = {"Dalaran Sharp", "Stormwind Brie", "Alterac Swiss" };                                  // System.out.print("Enter the amount of Sharp: ");
	 double [] perpound = {1.25, 10.00, 40.00 };                                                              // int Sharp = input.nextInt();
	 int [] amount= new int [3];                                                                            // System.out.print("Enter the amount of Brie: ");
	 double discount = 0;
	          int i= 0;                                                                                               // int Brie = input.nextInt();
	
	  for (i=0; i<3; i++ ){
			System.out.println( name [i] + ": $" + perpound [i] + " per pound");
			                                                               }                                 // System.out.print("Enter the amount of Swiss: ");
		                                                                                                      //int Swiss = input.nextInt();
		         
      for (i=0; i<3; i++ ){
	   System.out.print("Enter the amount of " + name[i].substring(name[i].indexOf(' ') + 1) + ": ");
	  amount[i] = input.nextInt();
      }
        
		System.out.println("Display the itemized list? 1 for yes");                   
		int itemized = input.nextInt();
		double subtotal = 0;                                                                        //Double subtotal = sharp *1.25 + Brie *10.00 + swiss * 40.00
		for(i = 0; i < 3; i++) {
			subtotal += perpound[i] * amount[i];
		}
		
		
		if ( subtotal > 100) 
			discount = 25;
		else if (subtotal>50)
			discount = 10;
      for ( i=0; i<3; i++){                                             //if (itemized == 1 ) {                          
		if (itemized == 1 ){                                          // if  (sharp >0)
			if (amount[i]>0)                                          //     System.out.print (sharp + "lbs of sharp @ 1.25 = " + sharp * 1.25);
				                                                      // if (Brie >0)
				                                                       //System.out.print (Brie + "lbs of Brie @ 10.00 = " + Brie * 10.00);
				                                                      // if (swiss>0)
				                                                        // System.out.print (swiss + "lbs of swiss @ 40.00 = " + swiss * 1.25);
				System.out.println( amount[i] + " lbs of " + name[i].substring(name[i].indexOf(' ') + 1) + " @ " + perpound[i] + " = " + perpound[i]*amount [i] );
			
			}
}
		 System.out.println("SubTotal: $" + subtotal);
		 System.out.println("Discount: $" + discount);
		 System.out.println("Total: $" + (subtotal - discount));
		
		
		
		
		
		
		
		
		
		
		

	
	}
}
