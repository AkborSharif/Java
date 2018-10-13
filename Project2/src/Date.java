import java.util.Scanner;

public class Date { 
private int day;
private int month;
private int year;

private static final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public Date(int year, int month, int day) {    //constructor
		setDate(year, month, day);
	}
	
	public Date(String dt) {
		Scanner scan = new Scanner(dt);
		scan.useDelimiter("-"); //
		int month = scan.nextInt();
		int day = scan.nextInt();
		int year = scan.nextInt();
		scan.close();
		setDate(year, month, day);
	}

	private boolean dateValidation(int year, int month, int day) {
		if(year >= 1900 && year <= 3000) {
			if(month >= 1 && month <= 12) {
				if(day <= daysInMonth[month - 1]) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean dayValidation(int day) {
		return dateValidation(this.year, this.month, day);
	}
	
	private boolean monthValidation(int month) {
		return dateValidation(this.year, month, this.day);
	}
	
	private boolean yearValidation(int year) {
		return dateValidation(year, this.month, this.day);
	}
	
	public void setDate(int year, int month, int day) {
		if(dateValidation(year, month, day)) {
			this.year = year;
			this.month = month;
			this.day = day;
		}
	}
	
	public void setDay(int day) {
		if(dayValidation(day)) {
			this.day = day;
		}
	}

/* it works, but not really pretty.
public void setDay(int day) {
	
	if(day > 0 && day <= 31) {
		if(month == 2) {
			if(year % 4 == 0 && !(year % 400 == 0)) {
				if(day <= 29) {
					this.day = day;
				}
			} else {
				if(day <= 28) {
					this.day = day;
				}
			}
		}
		
		if(month == 4 && month == 6 && month == 9 && month == 11) {
			if(day <= 30) {
				this.day = day;
			}
		}
		this.day = day; // repeating, so not efficient 
	}
	
	*/
	
	/*
	if(day > 0 && day <= 31 && day <= 28 && day <= 29) {
		does not make sense!
	}*/
	
/*
public void setDay(int day) {
	 if (day>0 && day<=31){
		 this.day = day;
	 }else 
		 System.out.println("error");
	 
	
	 
	 }
	 
*/
	public void setMonth(int month) { // Mutator 
		if(monthValidation(month)) {
			this.month = month;
		}
	}
	public void setYear(int year) { // Mutator 
		if(monthValidation(year)) {
			this.year = year;
		}

	}
	 
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getYear() {
		 return year;
	}
	
	private int dayOfYear() {
		   int totalDays = 0;   
		   switch (month) {    
		   case 12: totalDays += 30;         
		   case 11: totalDays += 31;         
		   case 10: totalDays += 30;         
		   case 9 : totalDays += 31;         
		   case 8 : totalDays += 31;         
		   case 7 : totalDays += 30;         
		   case 6 : totalDays += 31;         
		   case 5 : totalDays += 30;         
		   case 4 : totalDays += 31;         
		   case 3 : totalDays += 28;         
		   case 2 : totalDays += 31;  
		   }
		  return  totalDays += this.day;
		   
	}
		
	 public int compare(Date dt) {
		int difference = Math.abs((dayOfYear() + 365 * year ) - (dt.dayOfYear() + 365 * dt.year));
		int numMonths =  difference / 30;
		if (numMonths > 60) {
			numMonths = 60;
		}
		return numMonths;
	}
	
	
	public String toString() {
		return "" + this.year + "/" + this.month + "/" + this.day;
	}
 }

