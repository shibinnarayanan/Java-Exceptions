package com.svv.exceptions;

public class Test1 {

	
	public static void main(String[] args) {
		
//		code with try catch block
//		try {
//			int j= 9/0;
//		} catch (Exception e) {
//			System.out.println("error -> "+e.getMessage());
//		}
//		code with out try catch block		
		int j= 9/0;
		
		System.out.println("Code executed"); //with out try catch blow the program flow will stop and this line will not execute
	}
}
