/*
 * Name: Paulo D.Velado
 * Date: 8/5/2018
 * 
 * Desc: User will enter two integer values (a starting and ending point) and the 
 * program will calculate the Factorial all the numbers in this range and save both the 
 * numbers and the factorial values in an array. Values will be checked to:
 * 1) Make sure inputs are  positive integers.
 * 2) Make sure the starting value is less than the ending value.
 * 3) Make sure the values are no greater than 20. (Factorial numbers larger than 20
 * will be to large to be saved.
 * 
 * Usage: User can then print the results of the arrays.
 */

import java.util.Scanner;

public class Factorials {

	private Scanner input = new Scanner (System.in);
	private int startVal, endVal, indexSize;
	private int [] factNumArr;
	private long [] factValArr;
	
	
		// Constructor
	public Factorials() {
		inputVal();
		setIndexSize();
		setFactNumArr();
		setFactValArr();	
	}
	
	// Public Methods //
	
		// Prints Both Arrays as a Table
	public void printResults() {
		System.out.println("\nNumber   Factorial");
		
		for (int i = 0; i < factNumArr.length;i++) {
			System.out.printf("%-8d %-15d \n",factNumArr[i], factValArr[i]);
		}
	}
	
	
	// Private Methods //
	
		// User Inputs Starting and Ending Values
	private void inputVal() {
		System.out.print("Starting value: ");
		startVal = input.nextInt();
		System.out.print("Ending value: ");
		endVal = input.nextInt();
		
		checkInput();
	}
	
		// Checks if inputs Errors (if Error present, promts to re-input values
	private void checkInput() {
		if (startVal > endVal) {
			System.out.println("System Error: Starting value must be less than Ending Value");
			inputVal();
		}
		
		if (startVal <= 0 || endVal <= 0) {
			System.out.println("System Error: Input values must be positive integers");
			inputVal();
		}
		
		if (startVal > 20 || endVal > 20) {
			System.out.println("System Error: Ending value Cannot be greater than 20");
			inputVal();
		}
	}
	
	private void setIndexSize() {
		indexSize = 1 + (endVal - startVal);
	}
	
		// Sets Factorial numbers range as an array
	private void setFactNumArr() {
		
		factNumArr = new int [indexSize];
		int count = startVal;
		
		for(int i = 0; i < indexSize; i++) {
			factNumArr[i] = count;
			count ++;
		}
	}
	
		// Sets Factorial values of the numbers in factNumArr's corresponing indexs
	private void setFactValArr() {
		factValArr = new long [indexSize];
		
		for(int i = 0; i < indexSize; i++) {
			factValArr[i] = calcFactorial(factNumArr[i]);
		}
		
	}
	
		// Calculates Factorial of the Integer entered
	private long calcFactorial (int num) {
		
		long fact = 1;
		
		for (int i = 1 ; i <= num; i ++ ) {
			fact = fact * i;
		}
		
		return fact;
	}
	
	
		// Test Method
	public static void main(String[] args) {
		Factorials f = new Factorials();
		f.printResults();
	}

}
