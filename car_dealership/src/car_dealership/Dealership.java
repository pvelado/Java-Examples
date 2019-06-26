package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		
		Customer cust1 = new Customer("Tom", "123 Anything St.", 25000);

		Vehicle vehicle = new Vehicle ("Honda", "Accord", 15000);

		
		Employee emp = new Employee ();
		
		cust1.purchaseCar(vehicle, emp, false);
		
		Vehicle car = new Vehicle("BMW","M3", 20000);
		Vehicle car2 = new Vehicle("BMW","M3", 20000);
		
		boolean test = car.equals(car2);
		System.out.println(test);
		
		/**
		 * 
		 * handleCustomer (Customer cust, boolean finance, Vehicle)
		 * 
		 * 	if(finance == true)
		 * 		runCreditHistory(Customer cust, double doubleAmount)
		 * else if(vehicle.getPrice() <= cust.cashOnHand):
		 * 		processTransaction(Customer cust, Vehicle vehicle)
		 * else:
		 * 		tell customer to bring more money
		 */
		
	}

}
