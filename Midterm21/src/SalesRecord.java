import java.util.*;
public class SalesRecord {
          public static void initialize (double[]array){
        	  for (int i=0; i<array.length; i++ ){
        		  array[i] = 100.0;
        		  
        	  }
          }
          public static void setBonus (double[]bonus, int month, double amount){
        	  if (month>=0 && month<12 && amount > 0.0){
        		 bonus[month] = amount;
        	  } 
          }public static double calcSalary (double [] bonus, double monthlySalary){
              double  totalBONUS =0 ;
        	  for (int i=0; i<bonus.length; i++)
        		  totalBONUS += bonus [i];
          return monthlySalary * 12  +  totalBONUS;
          }
          public static void main(String[] args) {
        	  double totalSalary;    
        	  Scanner input = new Scanner(System.in);    
        	  String name;      // employee's name    
        	  int year;            // calendar year    
        	  double monthlySalary;   // employee's monthly salary without bonus    
        	  double[] bonus;    
        	  System.out.println("Please enter your name: ");
        	  name = input.nextLine();
        	  System.out.println("Please enter the year: ");
        	  year = input.nextInt();
        	  System.out.println("Monthly salary: "); // Ask user for employee’s monthly salary and set it to the variable monthlySalary
        	  monthlySalary = input.nextDouble();
              bonus = new double [12]; 
        	  initialize (bonus);
        	  for (int i =0; i<bonus.length; i++){
        		  System.out.println("enter " +i+ " month bonus: ");
        		double amount = input.nextDouble();
        		if (amount>100)
        			setBonus (bonus, i, amount);
        	  }
        			totalSalary =  calcSalary(bonus, monthlySalary);
        			System.out.println("totalsalary: " + totalSalary);
        			
					
        		} 
				
        	  }
        	
          
          
