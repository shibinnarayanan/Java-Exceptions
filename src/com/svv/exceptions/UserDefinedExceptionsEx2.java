package com.svv.exceptions;

import java.util.Scanner;

public class UserDefinedExceptionsEx2 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a number -- ");
		
		int num = scn.nextInt();
		
		
		try {
			SampleException.validateInput(num);
		} 
		catch (InvalidInputException e) {
		
			System.out.println("Caught Exception - Input is greater than 100");
		}
		
		System.out.println("exectued...........");

	}
}

class SampleException {
    static void validateInput(int number) throws InvalidInputException
    {
    	if(number > 100)
    	{
    		throw new InvalidInputException("Limit exceeded");
    	}
    	System.out.println("Valid Input");
    }
}

class InvalidInputException extends Exception{
	InvalidInputException(String msg)
	{
		super(msg);
	}
}

