import java.util.Scanner;

public class Interviewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String name;
	String likesToLearn;
	String majorJob;
	String jobInterest;
	int ageYears;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("What is you name?");
	name = input.nextLine(); 
	System.out.println("His name is " + name + ".");
	
	System.out.print("What do you like to learn about?");
	likesToLearn = input.nextLine();
	System.out.println("He likes to learn about " + likesToLearn + ".");
	
	System.out.print("Why do you take CSE major?");
	majorJob = input.nextLine();
	System.out.println("He wants to be a " + majorJob + ".");
	
	System.out.print("Why do you want to be a " + majorJob + ".");
	jobInterest = input.nextLine();
	System.out.println("Because he wants to do " + jobInterest + ".");
	
	System.out.print("How old are you?");
	ageYears= input.nextInt();
	System.out.println("He is " + ageYears + " years old.");
	
	
	}

}
