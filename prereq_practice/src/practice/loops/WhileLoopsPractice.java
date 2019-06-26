package practice.loops;

public class WhileLoopsPractice {

	public static void main(String[] args) {
			// prints count 10 times
		int count = 0;
		while (count <= 10) {
			System.out.println("count " + count);
			count = count + 1;
		}
		
		while (count <= 10) {
			System.out.println("count 2 " + count);
			count = count + 1;
			if (count == 3) 
				break; // this will break out of the entire block 
		}
		
		String s = "We have a large inventory of things in our warehouse falling in "
				+ "the category:apperal and the slightly "
				+ "more in demand category:makeup along with the category:furniture and ...";
		
		printCategories(s);
		
		
		
		
	}
	
	/**
	 * extracts all categories from the string argument
	 * @param str
	 */

	public static void printCategories (String str) {
		int index = 0;
		
		while(true) {
			int found = str.indexOf("category:", index);
			if (found == -1)
				break;
			
			int start = found + 9; // start of the actual category
			int end = str.indexOf(" ", start);
			System.out.println(str.substring(start,end));
			
			index = end + 1;
		}
	}

}
