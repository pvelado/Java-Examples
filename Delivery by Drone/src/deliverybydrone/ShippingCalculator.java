package deliverybydrone;

import java.util.Scanner;

public class ShippingCalculator {
	Scanner input = new Scanner(System.in);
		
		private double shipCost;
		private double shipRate;
		private double weight;
		private int distance;
		private boolean member = false;
		
	
		
		public void printGreeting() {
			System.out.println("Welcome to Amazon Shipping Calculator\n");
		}
		
		public void printResults() {
			System.out.printf("\nPackage weight = %.1f Kg\n", weight);
			System.out.printf("Shipping rate = $%.2f per 50 miles\n",shipRate);
			System.out.printf("Number of miles = %d\n\n", distance);
			System.out.printf("Total shipping charges = $%.2f\n\n", shipCost);
			System.out.println("Goodbye");
		}
		
		public void setVal() {
			setDistance();
			setWeight();
			setMember();
			shipRate = calcRate(weight);
			shipCost = calcTotal(shipRate, distance, member);
			
		}
		
		private void setDistance() {
			System.out.print("Please enter the distance to be shipping (in miles): ");
			distance = input.nextInt();
	
			
			if (distance < 0) {
				System.out.print("\nShipping Distance must be positive. Program Aborted");
				System.exit(0);
			}
			else if (distance > 3000) {
				System.out.println("Cannot Ship more than 3000 miles. Program Aborted");
				System.exit(0);
			}	
		}
		
		private void setWeight() {
			System.out.print("Please enter the weight of the package, in Kg: ");
			weight = input.nextDouble();
			
			
			if (weight < 0) {
				System.out.println("Invalid Package Weight. Program aborted");
				System.exit(0);
			}
			else if (weight > 20) {
				System.out.println("Cannot accept packages over 20 Kg. Program aborted");
				System.exit(0);
			}
		}
		
		private void setMember() {
			
			System.out.print("\nAre you a Amazon Prime Member? (Yes/No): ");
			String temp = input.next();
			
		
			
			if (temp.contains("Y"))
				member = true;
			
				
			
		}
		
		private double calcRate(double w) {
			
			double rate = 0;
			
				if (w <= 2)
					rate = 5.10;
				else if (w <= 6)
					rate = 10.18;
				else if (w <= 10)
					rate = 22.43;
				else if (w <= 20)
					rate = 40.60;
			
				return rate;
			}
		
		private double calcTotal(double r, int d, boolean m) {
			
			
			double total = 0;
			int counter = 0;
			
			for (int i = d;i >= 0;i = i - 50) {
				counter++;
			}
			total = counter * r;
			
			if (m == true) {
				total = total - (total * 0.1);
			}
			
			return total;
		}
		
		

	public static void main(String[] args) {
		ShippingCalculator sc = new ShippingCalculator();
		
		sc.printGreeting();
		sc.setVal();
		sc.printResults();
	}

}
