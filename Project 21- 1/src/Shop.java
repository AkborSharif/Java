import java.util.Scanner;

public class Shop {

	static String[] names;
	static double[] prices;
	static int[] amounts;
	static double amount;
	static double discountrate;

	public static void printintro() {
		System.out.println("This program supports 4 functions:");
		System.out.println("1.Setup Shop");
		System.out.println("2.Buy ");
		System.out.println("3.List Items");
		System.out.println("4.Checkout");
		System.out.print("Please choose the function you want:");
	}

	public static void SetupShop() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the number of items: ");
		int number = in.nextInt();
		names = new String[number];
		prices = new double[number];
		amounts = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.print("Enter name of product " + i + ":");
			in.nextLine();
			names[i] = in.nextLine();
			System.out.print("Enter price of product " + i + ":$ ");
			prices[i] = in.nextDouble();
		}
		System.out.print("Please enter the amount to qualify for discount:");
		amount = in.nextDouble();
		System.out.print("Please enter the discount rate(0.1 for 10%)");
		discountrate = in.nextDouble();
	}

	public static void Buy() {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < prices.length; i++) {
			System.out.print("Enter the amount of " + names[i] + ":");
			amounts[i] = in.nextInt();

		}
	}

	public static void printList() {
		boolean hasNotBought = true;
		for (int i = 0; i < prices.length; i++) {
			if (amounts[i] != 0) {
				hasNotBought = false;
			}
		}
		if (!hasNotBought) {
			for (int i = 0; i < prices.length; i++) {
				if (amounts[i] != 0) {
					System.out.println(
							amounts[i] + " count of " + names[i] + " @ " + prices[i] + " = $" + amounts[i] * prices[i]);
				}
			}
		}

	}

	public static void checklist() {
		double subtotal = 0;
		boolean hasNotBought = true;
		for (int i = 0; i < prices.length; i++) {
			if (amounts[i] != 0) {
				hasNotBought = false;
			}
			subtotal += amounts[i] * prices[i];
		}
		if (!hasNotBought) {
			System.out.println("");
			System.out.println("Thank you for shopping !");
			System.out.println("Sub Total: $" + subtotal);
			if (subtotal >= amount) {
				System.out.println("-Discount: $" + discountrate * subtotal);

				System.out.println("Total    : $" + (subtotal * (1 - discountrate)));
			}else {
				System.out.println("Total    : $" + subtotal);
			}
		}
	}      

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean keepRunning = true;
		boolean buyItems = false;
		while (keepRunning) {
			printintro();
			int function = input.nextInt();

			if (function == 1) {
				SetupShop();
			} else if (function == 2) {
				if (names != null) {
					Buy();
					buyItems = true;
				} else{
					System.out.println("");
					System.out.println("Shop is not setup yet!");
					System.out.println("");
				}
			} else if (function == 3) {
				if (names != null && buyItems == true ) {
					printList();
				} else if(names == null ) {
					System.out.println("");
					System.out.println("Shop is not setup yet!");
					System.out.println(); 
				}
				else if (buyItems == false) {
					System.out.println("");
					System.out.println("Try again: You have not bought anything");
					System.out.println("");
				}  			
				} else if (function == 4) {
				if (names != null && buyItems == true) {
					checklist();
					break;
				} else if(names == null ) {
					System.out.println("");
					System.out.println("Shop is not setup yet!");
					System.out.println(); 
				}
				else if (buyItems == false) {
					System.out.println("");
					System.out.println("Try again: You have not bought anything");
					System.out.println("");
				}  
			} else if (function == 0)
				keepRunning = false;

			if (function > 4) {
				System.out.println("");
				System.out.println("Error: Do not know " + function);
				System.out.println("");
			}
		}

	}

}
