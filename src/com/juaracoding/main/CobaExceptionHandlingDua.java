package com.juaracoding.main;

class BebasException extends Exception{
	public BebasException (String s) {
		super(s);
	}
}

public class CobaExceptionHandlingDua {
	public static void main(String [] args) {
		try {
			throw new BebasException("Throw new Message Error");
		}
		catch(BebasException bebas) {
			System.out.println("Bebas Exception");
			System.out.println(bebas.getMessage());		
		}
	}
}
