package com.learnJava;

public class Main {
	/**
	 * Write a method called checkNumber with an int parameter called number
	 * The method should not return any value, and it needs to print out:
	 * 
	 * "positive" if the parameter number > 0
	 * "negative" if the parameter number < 0
	 * "zero" if the parameter number equal to 0
	 * 
	 * NOTE: The checkNumber method need to be defined as public static
	 * NOTE: Do not add a main method to your solution code.
	 */
	public static void main(String[] args) {
		
		PositiveNegativeZero.checkNumber(15);
		PositiveNegativeZero.checkNumber(0);
		PositiveNegativeZero.checkNumber(-5);
	}

}
