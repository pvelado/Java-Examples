/*	
 * Name: Paulo D. Velado
 * Date: 8/2/1018
 * 
 * Desc: To find all the primes in a given range. User will need 
 * to enter an lower and upper limit to set the range (lower limit can be negative).
 * Limits will be checked to make sure the lower limit is < the upper limit (if not 
 * user will be asked to enter new limits. Program will then set the size of the prime array, 
 * and save all the primes in accending order in the array.
 * 
 * Usage: User then will have the option to print the number of primes in the array, print the list 
 *  of primes in the array, and can ask for a spasific prime baised on the primes index location. 
 */
import java.util.Scanner; 

public class Prime {
Scanner input = new Scanner(System.in);
	
	private int upLmt;	// Upper limit of data set 
	private int lowLmt; // Lower limit of data set
	private int arrSize; // prmNumSet array size
	private int [] prmNums; // Arr to hold all prime number of data set
	
		// Default Constructor0
	public Prime() {
		setLowLmt();
		setUpLmt();
		checkLimits();
		setArrSize();
		setPrmNums();
		
	}
		// Constructor
	public Prime(int lowLmt, int upLmt) {
		this.lowLmt = lowLmt;
		this.upLmt = upLmt;
		checkLimits();
		setArrSize();
		setPrmNums();
	}
	
		// Sets Lower Limit 
	private void setLowLmt() {
		System.out.print("Enter a lower limit : ");
		lowLmt = input.nextInt();
		
	}	// Sets Upper Limit
	private void setUpLmt() {
		System.out.print("Enter an upper limit : ");
		upLmt = input.nextInt();
	}
		// Checks Limits are valid
	private void checkLimits() {
		if (lowLmt > upLmt) {
			System.out.println("System Error: Upper limit must be greater than lower limit!");
			setLowLmt();
			setUpLmt();
			checkLimits();
		}
	}
		// Sets Prime Array Index Size
	private void setArrSize() {
		
		int size = 0;
		
		for (int i = lowLmt ; i <= upLmt; i++)
		{
			boolean is_Prime = checkPrime(i);	
			if (is_Prime == true)
				size++;	
		}
		
		arrSize = size;
	}
		// Sets Prime numbers in Array
	private void setPrmNums() {
		
		prmNums = new int [arrSize];
		int arrIndex = 0;
		
		for (int i = lowLmt ; i <= upLmt; i++)
		{
			boolean is_Prime = checkPrime(i);	
			if (is_Prime == true) {
				prmNums [arrIndex] = i;
				arrIndex++;
			}	
		}
	}
	
		// Returns if Number entered is Prime
	private boolean checkPrime(int n) {
		
		if (n <= 1)
			return false;
		for (int j = 2; j < n; j++) {	
			if (n % j == 0) 
				return false;
		}
		
		return true;
	}
	
		// Prints Index Size
	public void printNumberOfPrimes() {
		System.out.println("\nNumber of Primes in entered range : " + arrSize);
	}
	
		// Prints All Prime Numbers in Array
	public void printPrmNums() {
		
		System.out.println("\nPrime numbers between entered range : \n");
		
		for (int i = 0;i < arrSize;i++) {
			System.out.printf("Prime %d : %d\n",i+1,prmNums[i]);
		}
	}
		// Returns a prime number in a specified index location
	public int getPrimeNum(int index) {
		
		if (index > arrSize || index < 1) {
			System.out.println("System Error: Index entered does not exist!");
			return 0;
		}
		
			return prmNums[index - 1];
	}
	public static void main(String[] args) {
		
		Prime p1 = new Prime ();
		//Prime p2 = new Prime (-90, 100);
		
		p1.printNumberOfPrimes();
		p1.printPrmNums();
		
		int test = p1.getPrimeNum(5);
		System.out.println("\nPrime Selected Index: "+ test);
		
		//p2.printNumberofPrimes();
		//p2.printPrmNums();
	}
}
