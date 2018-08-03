package interestcalculator;

public class InterestCalculator {
	
	private int amount;
	private int months;
	private double rate;
	private double total;
	
	public InterestCalculator(int amount, int months, double rate) {
		
		this.amount = amount;
		this.months = months;
		this.rate = rate;
	}
	

	private double calcInt() {
		double interest = (amount * months * rate)/1200;
		return interest;
	}
	
	private double calcTotal() {
		total = calcInt() + amount;
		return total;
	}

	
	public void showOwedAmount() {
		System.out.println("Clients Principal Balance: $" + amount);
	}
	public void showReleventMonths() {
		System.out.println("Months Interst was Calculated: " + months);
	}
	public void showTotalOwed() {
			System.out.println("Client owes: $" + (int)calcTotal());
	}
	

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	

	public static void main(String[] args) {

		InterestCalculator ic = new InterestCalculator(10300, 8, 18);
		ic.showOwedAmount();
		ic.showReleventMonths();
		ic.showTotalOwed();
		
	}
}
