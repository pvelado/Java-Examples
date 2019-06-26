package practice.strings;

public class StringPractice {

	public static void main(String[] args) {
		
		System.out.println("hello world!");
		
		String a = "hello";
		String b = "there";
		String str = "ABCDEFG";
		String str2 = "hello there yogi";
		String extractedString = str.substring(2);
		String extractedString2 = str.substring(0, 3);
		
			// prints string a 
		System.out.println();
			// prints the length of the string
		System.out.println("The length of sting a is: " + a.length());
			// prints extractedString (substring of str)
		System.out.println("sub string of varable str: "+ extractedString);
			// prints out extractedString2 (substring of str)
		System.out.println("the second sub string of variable str is : " + extractedString2 );
		
		
			// improper way to compare strings
		if (a == "hello") {
			System.out.println("hoopla");
		}
			/*
			 * the == returns true only if the references point to 
			 * the same memory location. This is fine with primitive 
			 * types but since String is a object class there is a better way.
			 */
		
			// The proper way to compare strings 
		if (a.equals("hello")) {
			System.out.println("Strings compared correctly!");
		}
		
		if (b.equalsIgnoreCase("THere")) {
			System.out.println("Strings compared without considering case");
		}
		
			// printing out the specific character in a string
		System.out.println("the 3rd character in string a is: " + a.charAt(2));
		
			// finding out were "there" occurs in str2
		int a1 = str2.indexOf("there", 7);
		
		System.out.println("There first occurs at index: "+ a1);
		
		
		
		
	}

}
