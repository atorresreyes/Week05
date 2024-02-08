package com.promineotech;

public class App {

	public static void main(String[] args) {
		
		 // 6. Create a class named App that has a main method.
		  
			 /* a. In this class instantiate an instance of each of your logger classes that
			 * implement the Logger interface.
			 */
		Logger loggerAsterisk = new AsteriskLogger();
		Logger loggerSpaced = new SpacedLogger();
		
			// b. Test both methods on both instances, passing in Strings of your choice.
		loggerAsterisk.log("Hello");
		System.out.println();
		loggerSpaced.log("Hello");
		System.out.println();
		
		loggerAsterisk.error("Good Bye");
		System.out.println();
		loggerSpaced.error("Good Bye");

		
	}

}
