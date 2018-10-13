import java.util.Scanner;


/*Modifier      Class        Package                SubClass             World
public           Y              Y                      Y                   Y
protected        Y              Y                      Y                   N
no modifier      Y              Y                      N                   N
private          Y              N                      N                   N﻿   */

public class inputstringsteam {

	public static void main(String[] args) {
		Scanner inss = null;
		
		String studentsInfo = "Amy is 20";
		String firstname = "";
		String lastname = "";
		int userAge = 0;
		
		
		inss = new Scanner (studentsInfo) ;

		firstname = inss.next(); 
		lastname = inss.next();
		userAge = inss.nextInt();
		
		
	System.out.println("First name:" + firstname + "\n" + "Last name:" + lastname + "\n" + "Age:" + userAge );
	
		return;
	}

}  
