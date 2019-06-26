
public abstract  class Animal {
		// Animal attributes
	int age;
	String gender;
	int weightInLbs;
	
	
		// Animal constructor
	public Animal (int age, String gender, int weightInLbs ) {
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}
	
		// Animal Behaviors
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}
	
	public abstract void move();
}
