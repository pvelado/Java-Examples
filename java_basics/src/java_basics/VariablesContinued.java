package java_basics;

public class VariablesContinued {

	public static void main(String[] args) {
		
		/*
		 * Data Types 
		 */
		
		int var = 1000000000; // int hold 2 ^32 is the largest number that into can hold.
		var = -1000000000; // this applies to negative  numbers as well.
			
			/*
			 * for larger numbers you can use long but note that 
			 * more memory will be allocated for long then int.
			 * Also if L isn't used at the end of number, it will be 
			 * treated as an int not a long. 
			 */
			
		long bigNumber = 1000000000000000000L; 
		
			// for smaller numbers short can be used
		short smallNumber = 32767; // this is the largest number that be used with short
		smallNumber = - 32768; // this is the smallest number that be used with short
		
			// even smaller than short is the byte
		byte reallySmallNumber = 127; // this is the largest number that byte can hold.
		reallySmallNumber = -128; // this is the smallest number that the byte can hold.
		
		
			// for decimals you can use double for float
		
		double decimalVariable = 394.003;
			// similar to long, you must put a f at the end of the number
		float deciamalVariableTwo = 345.029f;
		
			// for true or false decisions you can use boolean.
		boolean decision = true;
		decision = false;
		
			// To hold a single letter you would use char.
		char letter = 'f';
		
		
		// for more information visit https://docs.oracle.com/javase/tutorial/java/nutsandbolds/datatypes.com
		
	}

}
