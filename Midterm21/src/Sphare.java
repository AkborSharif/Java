import java.util.Scanner;

public class Sphare {
	public static double volumeofsphare(double p, double r){
		return (4.0/3.0*p*r*r*r);
		
	}

	public static void main(String[] args) {
	double radius; double Pi; double volume;
	Scanner input = new Scanner (System.in);
	System.out.print("please enter the pi: ");
	    Pi = input.nextDouble();
	System.out.print("please enter the radius: ");
	    radius = input.nextDouble();
     volume = (volumeofsphare(Pi,radius)); 
     System.out.println ("volume: "+ volume );
	}
	
}
