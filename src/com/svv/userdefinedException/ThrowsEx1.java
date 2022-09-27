package com.svv.userdefinedException;

public class ThrowsEx1 {
	
	public static void main(String[] args) {
		
		try {
			int i = 8/0;
		}
		catch (Exception e) {
			throw new ArithmeticException();
		}
		
		
		System.out.println("Code executed .... ");
	
	}

}
