package com.svv.exceptions;

public class CheckedVsUnCheckedExceptionEx1 {
	
	public static void main(String[] args) {
		 
		 /* checked exception example */
		//---------------------------------------------------------
		 try {
		  Class.forName("com.mcnz.Example");
		 } catch (ClassNotFoundException e) {
		  System.out.println("Class was not found.");
		 }
		 
			/* see the example for compile time exception after uncomment below code
			 * Unhandled exception type ClassNotFoundException...need to use try catch block
			 * Class.forName("com.mcnz.Example");
			 */
		  
		 /* Unchecked exception example */ //Run Time exception 
		//---------------------------------------------------------
		 String input = null;
		 input.length(); // throws an unchecked exception
		    
		}

}
