/*
* Name: Paulo D. Velado
* Date: 7/30/18
*   
* Desc: User will enter an increased incrementation value and an upper limit  
* of incrementation. Incremented will be saved in a Array and the sum of all incrementations 
* will be calculated. 
* 
* Usage:Program will then print the results of all increments and the Sum of all 
* the increments combined.
* Note: Negative Numbers will not be exepted as input. Program will be aborted if such input is 
* entered.
*/
import java.util.Scanner;

public class IncrementCalculator {
	Scanner input = new Scanner(System.in);
		
		// Private Variables
	private long sum;
	private int upperLimit;
	private int incrementation;
	private int dataArrSize;
	private int [] incrementDataValues;
	
		//Constructor
	public IncrementCalculator() {
		setIncrementation();
		setUpperLimit();
		setDataArrSize();
		calcIncrementDataValues();
		calcSum();
	}
		// Prints Increment Values
	public void printIncrementValues() {
		for(int i = 0; i < dataArrSize; i++) {
			System.out.printf("Increment %d: %d\n",i+1, incrementDataValues[i]);
		}
	}
	
		// Prints Sum of all Increment Values
	public void printSum() {	
		System.out.println("\nSum of all Increments: " + sum);
	}
	
		// Sets Incrementation (if num <= 0, Program will abort) 
	private void setIncrementation() {
		System.out.print("Enter incrementation value to increase by: ");
		incrementation = input.nextInt();
		
		if (incrementation <= 0) {
			System.out.println("System Error: Input must be larger than 0. Program Aborted");
			System.exit(0);
		}
	}
		// Sets the Upper Limit
	private void setUpperLimit() {
		System.out.print("Enter the upper limit: ");
		upperLimit = input.nextInt();
		
		if (upperLimit <= 0 ) {
			System.out.println("System Error: Input must be larger than 0. Program Aborted");
		}
	}
		// Sets Index Size for Array
	private void setDataArrSize() {
		int arrSize = 0;
		
		for (int i = 1; i <= upperLimit;i = i * incrementation) {
			arrSize++;
		}
		dataArrSize = arrSize;
	}
	
		// Sets increment Values into Array
	private void calcIncrementDataValues() {
		incrementDataValues = new int [dataArrSize]; 
		int arrIndex = 0;
		
		for (int i = 1;i < upperLimit;i = incrementation * i ) {
			incrementDataValues[arrIndex] = i;
			arrIndex++;
		}	
	}
		// Calculates the sum of all increment values in the Set Array
	private void calcSum() {	
		int temp = 0;
		
		for (int i = 0;i < dataArrSize; i++) {
			temp = temp + incrementDataValues[i];
		}
		sum = temp;
	}

	public static void main(String[] args) {
		IncrementCalculator ic = new IncrementCalculator();
		ic.printIncrementValues();
		ic.printSum();
	}
}

