package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		
		
		/*
		 * if/else statements
		 */
		boolean hungry = true;
		
			 /*
			  * If the the statement in the parentheses is correct
			  * it will execute the code under if, if it is false it will
			  * Execute the code under else
			  */
		if (hungry) {
			System.out.println("I'm starving");
		} else {
			System.out.println("I'm not hungry");
		}
		
			// can also do this 
		if (hungry == true) {
			System.out.println("I'm starving");
		} else {
			System.out.println("I'm not hungry");
		}
		
			// a ! mean not so the next statement asks if the person is not hungry
		if (!hungry) {
			System.out.println("I'm not hungry");
		} else {
			System.out.println("I'm starving");
		}
		
			// if the hungerRating 5 is less then 6 its true 
		int hungerRating  = 5;
		
		if (hungerRating < 6) {
			System.out.println("Not Hungry");
		}else {
			System.out.println("I am starving");
		}
		
		
		int favoriteTemp = 75;
		int currentTemp = 60;
		String opinion;
		
			// else if statements 
		
		if(currentTemp < favoriteTemp - 30) {
			opinion = "It's Pretty Darn Cold .. ";
		} else if(currentTemp < favoriteTemp - 20) {
			opinion = "It's kinda cold out...";
		} else if(currentTemp < favoriteTemp + 10){
			opinion = "It's hot out";
		}else {
			opinion = "It's a beautiful day...";
		}
		
		System.out.println("The opnion on the weather is " + opinion);
		
		
			// switch statements
		
		int month = 4;
		String monthString;
		
		switch(month) {
		case 1: monthString = "January";
			break;
		case 2: monthString = "February";
			break;
		case 3: monthString = "March";
			break;
		case 4: monthString = "April";
			break;
		default: monthString = "Unknown month"; // if none of the cases are present the default case will execute
			break;
		
		}
		
		System.out.println("THe month is " + monthString);
		
		
	}

}
