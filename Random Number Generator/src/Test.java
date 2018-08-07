/*
 * Name: Paulo D. Velado
 * Date: 8/6/18
 * 
 * Desc: Program simulates a simple dice roll of a 6 sided die. 
 * User can set an integer value of how many dice will be rolled 
 * and at once. Sum of dice will be saved as a Integer value 
 * 
 * Usage: User can print the sum of the dice rolled.
 */
import java.util.Random;
import java.util.Scanner;

public class Test {
	private Random dice = new Random();
	private Scanner input = new Scanner(System.in);
	private int sum = 0;
	private int numDice;

	
	public Test(){
		setDice();
		rollDice();
	}
	
	public void print() {
		System.out.println("Dice Roll Total: "+ sum);
	}
	
	private void setDice() {
		System.out.print("How many dice will be rolled? : ");
		numDice = input.nextInt();
	}
	private void rollDice() {
		
		for (int i = 1;i <= numDice ;i++){
			sum += dice.nextInt(5)+1;	
		}
	}
   public static void main(String[] args) {
	
	   Test t = new Test();
	   t.print();
	   
   }
} 
