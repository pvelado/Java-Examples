package practice.loops;

public class ForLoopsPractice {

	public static void main(String[] args) {
		
		String name = "Thisisateststring";
			// prints i 10 times
		for (int i = 0; i < 10; i++) {
			System.out.println("i: " + i);
		}
		
			// prints all the characters of name string
		for (int i = 0; i < name.length(); i++) {
			System.out.println("char: " + name.charAt(i));
		}
		
			// prints all the characters of name string starting from the last character
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println("char: " + name.charAt(i));
		}
		
			// Prints all the numbers that are even between 0 - 100
		for(int i = 0; i <= 100; i += 2) {
			System.out.println(i);
		}
		
		
		
	}

}
