import java.util.Random;
import java.util.Scanner;

public class Fruits {
	public static Random rangen = new Random (100);
	public static void intro (String [] names, double[] prices, double [] amounts){
		if (names.length >0){
			names [0] = "Mango";
			prices [0] = 5.00;
		}
		if (names.length>1){
			names [1] = "Orange";
			prices[1] = 6.00;
		}
		if (names.length>2){
			names[2]= "Apple";
			prices [2] = 7.00;
		}
		 System.out.println("We sell " + names.length + " kind of fruits." );
		if (names.length>0){
			System.out.println (names[0] + ": $" + prices[0] + " per pound. ");
		}
		if (names.length>1){
			System.out.println (names[1] + ": $" + prices[1] + " per pound. ");
		}
		if (names.length>2){
			System.out.println (names[2] + ": $" + prices[2] + " per pound. ");
		}
		for (int i = 3; i<names.length; i++){
				names [i] = "fruits type "+ (char) ('A'+i);
				prices [i] = rangen.nextInt(1000)/100;
				amounts [i] = 0;
			System.out.println(names[i] + ": $" + prices[i] + " per pound. ");
			
		}
	} public static void getAmounts(Scanner input,String[] names, double[]amounts){
		for (int i=0; i<names.length; i++){
		System.out.print("ENTER The amounts of "+ names[i] + ": ");
		amounts[i]=input.nextInt();
		}
	}
	public static void itemizedlist (String [] names, double [] prices, double [] amounts){
		for (int i=0; i<amounts.length; i++ ){
			System.out.println(amounts[i] + " lbs of " + names[i] + " costs $" + (amounts[i]*prices[i]));
		}
	}
	public static double calculateSubtotal (double [] prices, double [] amounts){
		double subtotal = 0;
		for (int i=0; i<amounts.length; i++ ){
			subtotal += (amounts[i]*prices[i]);
		}
		return subtotal;
	} 
	public static double discount(double subtotal){
		double discounts =0;
		if (subtotal>100){
			discounts = 10;
		}
		if (subtotal>50){
			discounts =5;
		}
		return discounts;
		
	}
	public static void printTotal(double subtotal, double discounts){
		System.out.println("_Subtotal: " + subtotal);
		System.out.println("_Dicount: " + discounts);
		System.out.println("_Total: " + (subtotal-discounts));
	}
	public static void main(String[] args) {
		final int maxfruits = 5;
		
		String [] names = new String [maxfruits];
		double [] prices = new double [maxfruits];
		double [] amounts = new double [maxfruits];
		
		Scanner input = new Scanner (System.in);
		intro (names, prices, amounts);
		getAmounts(input,names, amounts);
		
		double subtotal = calculateSubtotal(prices, amounts);
		if (maxfruits>0){
			System.out.println("_Display the itemized list: [press 1 if yes]");
			int item = input.nextInt();
		
			if (item==1){
				itemizedlist(names,prices, amounts);
			}
			}
		printTotal(subtotal, discount(subtotal));
		}
	}



