package oop;

public class SeasonCounter extends ModNCounter {

	
	private static String[] names =  {"spring", "summer", "fall", "winter"};
	
	
	public SeasonCounter() {
       super(4) ;// fill-in by creating an object with 4 divisor
    }
	

	@Override
	public String toString() {
         return names[value()] ;// fill-in so it returns the season name
	}
	
  	
}
