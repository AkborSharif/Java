import java.util.Scanner;

public class Manipulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scnr = new Scanner(System.in);
		
		//integer
		int n1, n2;
		
		System.out.println("Please enter the first number:");
		n1 = scnr.nextInt();
		System.out.print("Please enter the second number:");
		n2 = scnr.nextInt();
		
		int add1, sub1, times1, divide1, rem1;
		
		add1 = n1 + n2;
		sub1 = n1 - n2;
		times1 = n1 * n2;
		divide1 = n1 / n2;
		rem1 = n1 % n2;
		
		System.out.println(add1 + " " + sub1 + " " + times1 + " " + divide1 + " " + rem1);
		
		//short
		short n3, n4;
		
		System.out.println("Please enter the first number:");
		n3 = scnr.nextShort();
		System.out.print("Please enter the second number:");
		n4 = scnr.nextShort();
		
		short add2, sub2, times2, divide2, rem2;
		
		add2 = (short) (n3 + n4);
		sub2 = (short) (n3 - n4);
		times2 = (short) (n3 * n4);
		divide2 = (short) (n3 / n4);
		rem2 = (short) (n3 % n4);
		
		System.out.println(add2 + " " + sub2 + " " + times2 + " " + divide2 + " " + rem2);
		
		
		//floats
		float n5,n6;
		
		System.out.println("Please enter the first number:");
		n5 = scnr.nextFloat();
		System.out.print("Please enter the second number:");
		n6 = scnr.nextFloat();
		
		float add3, sub3, times3, divide3, rem3;
		
		add3 = (float) (n5 + n6);
		sub3 = (float) (n5 - n6);
		times3 = (float) (n5 * n6);
		divide3 = (float) (n5 / n6);
		rem3 = (float) (n5 % n6);
		
		System.out.println(add3 + " " + sub3 + " " + times3 + " " + divide3 + " " + rem3);
		
		//doubles
		double n7, n8;
		
		System.out.println("Please enter the first number:");
		n7 = scnr.nextDouble();
		System.out.print("Please enter the second number:");
		n8 = scnr.nextDouble();
		
		double add4, sub4, times4, divide4, rem4;
		
		add4 = (double) (n7 + n8);
		sub4 = (double) (n7 - n8);
		times4 = (double) (n7 * n8);
		divide4 = (double) (n7 / n8);
		rem4 = (double) (n7 % n8);
		
		System.out.println(add4 + " " + sub4 + " " + times4 + " " + divide4 + " " + rem4);
		
		
		return;
	}

}
