 import java.util.Scanner;
public class Bobcar {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		double economy = 35;
		double compact = 45;
		double standard = 95;
		
		double baseprice = 0;
		double discount = 0;
		double packageprice = 0;
		int PlatinumExecutivePackage = 0;
		String priceperday = "";
		
		System.out.println(" Available cars: Economy, Compact, Standard");
		System.out.println(" Choose 1 for Economy, 2 for Compact, 3 for Standard");
		System.out.print(" Please choose the rental car:");
		int selection = input.nextInt();
		
		
		System.out.print("Please enter the number of rental days:");
		int rentaldays = input.nextInt();
		
		System.out.println("Are you a club member?");
		System.out.print("Club member?: 1 for yes, 0 for no:"); 
		int clubmember = input.nextInt();
		
		
		if (clubmember == 1 ) {
			
			System.out.print("Platinum Executive Package?: 1 for yes, 0 for no:  ");
			
			PlatinumExecutivePackage = input.nextInt();
		}
			//base price calculation	
				if ( selection == 1) {
					 baseprice = economy * rentaldays ;
					 priceperday = "econnomy @ 35"; 
				}
				else if (selection == 2) {
					 baseprice = compact * rentaldays ;
					 priceperday = "compact @ 45";
				}
				else if (selection == 3) {
					 baseprice = standard * rentaldays ;
					 priceperday = "standard @ 95";
				}
				 
			
		      	//discount for club member
			if (clubmember == 1 ) {
				discount = economy * (rentaldays / 7);
			}
			
				//platinum package 
				if (PlatinumExecutivePackage == 1) {
					packageprice = baseprice * 0.15; 
				} 
		    System.out.println("");
				
			System.out.println("We appriciate your time!!! :)");
			
			System.out.println("Base:" + rentaldays + " days for a " + priceperday + "per day:$" + baseprice);
			
			System.out.println("Club Member Discount:-$  "   + discount);
			
			System.out.println("Platinum Executive Package:+$" + packageprice);
			
			System.out.println("Total Estimate for Rental:$ " + ((baseprice - discount) + packageprice));
			

	}

}
