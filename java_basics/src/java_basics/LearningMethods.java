package java_basics;

public class LearningMethods {

	public static void main(String[] args) {
		/*
		 * Methods
		 */
		
			// method calls
		printSomeJunk(); 
		printSomeJunkTwo("More Bla Bla Bla");
		
		printSomeJunkTwo(34);
		
		sum2Numbers(10, 23);
		
		int result = add10 (99);
	}
	
		// creating a method 
	public static void printSomeJunk() {
		System.out.println("Some bla bla bla");
	}
		// creating a method with an argument
	public static void printSomeJunkTwo(String arg) {
		System.out.println("Some bla bla bla " + arg);
	}
		
		/*
		 * Though the  method has the same name 
		 * because the data type is different the compiler
		 * will know what method you are trying to call. 
		 */
	public static void printSomeJunkTwo(int arg) {
		System.out.println("Integer passed in  " + arg);
	}
	
		// printing the sum of two arguments
	public static void sum2Numbers(int firstArg, int secondArg) {
		System.out.println("The some of the two arguments is : " + (firstArg + secondArg) );
	}
		//returning a variable
	public static int add10 (int someArgument) {
		int result = someArgument + 10;
		return result;
	}
	
}
