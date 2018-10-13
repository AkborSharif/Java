package oop;

public class Runner {

	public static void main(String[] args) {
		testCounter();

		testCounter7Statements();

		//testModNCounter();
	}

	
	public static void testCounter() {
		System.out.println("-- testing Counter");

		Counter c = new Counter();
		for (int i = 0; i<3; i++){
			c.increment();
		}
		System.out.println(c.value());

	}

	
	// Use this method to complete exercise 1c
	public static void testCounter7Statements() {
		Counter c = new Counter();
		System.out.println("-- testing 7 statements");
		c.reset();
		c.reset();
		c.reset();
		c.reset();
		c.increment();
		c.increment();
		c.increment();
		
		// include exactly 7 increment() and reset() statements below

		System.out.println("current value: " + c.value());
	}

}
