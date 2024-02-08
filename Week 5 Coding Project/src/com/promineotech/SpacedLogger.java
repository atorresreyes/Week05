package com.promineotech;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		char[] logArray = new char[log.length()];
		for (int i = 0; i < log.length(); i++) {
			logArray[i] = log.charAt(i);		
		}
		StringBuilder logBuild = new StringBuilder();
		for (char letter : logArray) {
			logBuild.append(letter + " ");
		}
		System.out.println(logBuild.toString());
	}

	@Override
	public void error(String error) {
		char[] errorArray = new char[error.length()];
		for (int i = 0; i < error.length(); i++) {
			errorArray[i] = error.charAt(i);		
		}
		System.out.print("ERROR: ");
		StringBuilder errorBuild = new StringBuilder();
		for (char letter : errorArray) {
			errorBuild.append(letter + " ");
		}
		System.out.println(errorBuild.toString());
	}

}
/* 5. Implement the SpacedLogger methods:
* 
* Note: The SpacedLogger should add a space or " " between each character of
* the String argument passed into its methods.
*/

	 // a. If the log method received “Hello” as an argument, it should print H e l l o
	  
	 /* b. The error method should do the same, but with “ERROR:” preceding the
	 * spaced out input (i.e. ERROR: H e l l o)
	 */