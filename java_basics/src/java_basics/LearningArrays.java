package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		
		/*
		 * Arrays
		 */
		
			// Arrays allow you to store multiple elements in a single variable 
		
		int [] values = new int[100]; // Declares int Array with 100 elements (slots 0 - 99)
		
		values [2] = 1000; // stores element to in the 3rd position in the index
		values [99] = 93432; // stores element in the 100th position in the index
		
			// You can print elements in specific indexes
		
		System.out.println("The second position is equal to " + values [2]);
		
			/*
			 * Note that if no element has been assigned to an index position
			 * by default the index position will hold a 0.
			 */
		
		System.out.println("Unassigned index = " + values [3]);
			
			/*
			 * Instead of declaring the amounts of slots in the 
			 * array, you can just add in the elements to the end of 
			 * the declaration.
			 */
		String[] words = new String [] {"My", "Name", "is"}; // index size of 3
		
		System.out.println("The last element in the array is " + words[2]); // prints the last element in the array
		
		//  Note: you cannot change the size of an array.
		
		// You would have to create a new array
		
		words = new String [10]; // created a new array in memory
		
		// words will not have any of the previously stored elements from this point
		
		System.out.println("words [2] = " + words [2]); // the old data is gone
		
		

	}

}
