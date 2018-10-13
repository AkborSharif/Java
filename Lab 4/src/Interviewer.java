import java.util.Scanner;

public class Interviewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String name;
		String likesToLearn;
		String majorJob;
		String jobInterest;
		int ageYears;
		int weight;
		
		Scanner input = new Scanner(System.in);
		
		//Questions
		System.out.print("What is your name?");
		name = input.nextLine(); 
		
		System.out.print("What do you like to learn about?");
		likesToLearn = input.nextLine();
		
		System.out.print("Why do you take CSE major?");
		majorJob = input.nextLine();
		
		System.out.print("Why do you want to be a " + majorJob + "?");
		jobInterest = input.nextLine();
		
		System.out.print("How old are you?");
		ageYears= input.nextInt();
		
		System.out.print("How much do you weighs?");
		weight = input.nextInt();
		double weightInKg;
		weightInKg = weight / 2.2;
		
		//Biography
		System.out.println("His name is " + name + ". " + "He likes to learn about " + likesToLearn + ".");
		System.out.println("He wants to be a " + majorJob + ". " + "Because he wants to do " + jobInterest + ".");
		System.out.println("He is " + ageYears + " years old. " + "He weighs about " + weightInKg + "kgs.");
		
		
		return;
	}

}
