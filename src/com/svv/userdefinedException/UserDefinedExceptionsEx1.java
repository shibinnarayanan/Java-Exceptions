package com.svv.userdefinedException;

public class UserDefinedExceptionsEx1 {
	
	public static void main(String[] args) {
		try {
			
			throw new MyExceptions("Exception occured");
		
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}


class MyExceptions extends Exception{
    

	
	
	  private String text;
	  
	  MyExceptions(String text) { this.text = text; }
	  
		/*
		 * // Object class is the parent class in Java. It contains the toString method.
		 * The toString // method is used to return a string representation of an
		 * object. If any object is printed, // the toString() method is internally
		 * invoked by the java compiler. // Else, the user implemented or overridden
		 * toString() method is called
		 */
	  
	  public String toString() { return "Exception caught -> "+text; }
	 

}