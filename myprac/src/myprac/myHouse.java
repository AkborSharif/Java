package myprac;

public class myHouse {
	
	public static void printHouse (House bd){
  System.out.println("House:"+ bd.getName() +"\n" +"Stories: " +bd.getStories() +"\n"+"Doors: " +bd.getDoors() +"\n" +"Bathrooms: " + bd.getBathrooms()+"\n"+ "Bedrooms: " + bd.getBedrooms() +"\n"+ "Preice Per Month: $" + bd.getPricepermonth());
	}

	public static void main(String[] args) {
		House myH = new House ("Purple", 2, 5, 2, 3,3000);
		House NewazH = new House ("Yellow", 3, 5, 4, 2,2000 );

		
		printHouse(myH);
		System.out.println("");
		System.out.println("Newaz");
		System.out.println("");
		
		printHouse(NewazH);
		
//System.out.println("House:"+ myH.getName() +"\n" +"Stories: " +myH.getStories() +"\n"+"Doors: " +myH.getDoors() +"\n" +"Bathrooms: " + myH.getBathrooms()+"\n"+ "Bedrooms: " + myH.getBedrooms());
		

	}

}
