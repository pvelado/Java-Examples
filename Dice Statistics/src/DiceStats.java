/*
 * Name: Paulo D. Velado
 * Date:8/7/18
 * 
 * Desc: Program calculates and prints statisics of random 6 sided dice rolls.
 * 
 * Usage: User enters integer values of both how many dice will be rolled and 
 * how many times the dice will be rolled. That number of dice will be rolled 
 * the number of times the user specified.  Program will save the possible 
 * sums of the rolls, number of times those sums appeared, and the percentage
 * of those appearences in seprate array lists. 
 */
import java.util.Random;
import java.util.Scanner;

public class DiceStats {
	
	private Random r = new Random();
	private Scanner input = new Scanner(System.in);
	
	private int numDice,numRolls, indexSize;
	private int [] diceTotal;
	private int [] sumTally;
	private double[] totalPerc;
	
		// Default Constructor
	public DiceStats () {
		inputNumDice();
		inputNumRolls();
		setIndexSize();
		setDiceTotal();
		setSumTally();
		setTotalPerc();
	}
		// Constructor
	public DiceStats(int numDice, int numRolls) {
		
		this.numDice = numDice;
		this.numRolls = numRolls;
		setIndexSize();
		setDiceTotal();
		setSumTally();
		setTotalPerc();
	}
	
	// Public Muthods //
	
		// Prints formatted results
	public void printResults() {
		System.out.printf("%-10s %-15s %-1s \n","Sum","# of times", "Percentage");
		
		for (int i = 0; i < indexSize; i++) {
			System.out.printf("%-10d %-15d %.2f \n"
					, diceTotal[i], sumTally[i], totalPerc[i]);
		}
	}
	
	//Private Methods//
	
		// Asks user how many dice will be rolled. ()
	private void inputNumDice() {
		System.out.print("How man dice will constitute one roll? : ");
		numDice = input.nextInt();
	}
	
		// Asks user how many rolls will be preformed.
	private void inputNumRolls() {
		System.out.print("How many rolls? : ");
		numRolls = input.nextInt();
	}
	
		// Sets the Index size for the classes arrays
	private void setIndexSize() {
		indexSize += (numDice * 6)- (numDice -1);
	}
	
		// Sets the possible dice totals in array
	private void setDiceTotal() {
		diceTotal = new int [indexSize];
		int count = numDice;
		
		for(int i = 0; i < indexSize; i++) {
			diceTotal [i] = count;
			count++;
		}
	}
	
		// Sets the number of times the totals appeared in an array.
	private void setSumTally() {
		sumTally = new int [indexSize];
		int currentRoll = 0;
			
			// initalize all indexs to zero.
		for (int i = 0; i < indexSize; i++) {
			sumTally[0] = 0;
		}
			/* Note: insted of searching the index for a match,
			 * Index is found directly by subtracting the number
			 * of dice from the form the index.
			 */
		do {
			int rollSum;
			rollSum = rollDice(numDice);
			
			sumTally [rollSum - numDice] += 1;  
			currentRoll++;
		}
		while (currentRoll != numRolls);

	}
		// Sets the apearence percentages in an array
	private void setTotalPerc() {
		totalPerc = new double[indexSize];
		
		for(int i = 0; i < indexSize; i++){
			totalPerc[i] = ((double)sumTally[i] / (double)numRolls * 100.00) ;
		}
	}
		// Rolls the dice
	private int rollDice(int numdice) {
		int total = 0;
		
		for (int i = 1;i <= numDice ;i++) {
			total += r.nextInt(6)+1;
		}
		
		return total;
	}
	
		// Main
	public static void main(String[] args) {
		DiceStats ds = new DiceStats ();
		//DiceStats ds = new DiceStats (4, 1000000);
		ds.printResults();
	}

}
