
public class Zoo {

	public static void main(String[] args) {
		
		
			// Created a variable of type bird that points to the Object that was created 
		Bird bird1 = new Bird(3, "F", 10); // objects are a runtime concept so it will only be created at runtime
		bird1.eat(); // from animal class
		bird1.sleep(); // from animal class
		
		Chicken chick1 = new Chicken(1, "M", 7);
		chick1.fly(); // Overrides fly method from Bird class
		
			/*
			 * Animal can be put as the variable type because the 
			 * object is created somewhere in memory. The object is of type Sparrow
			 * but the variable is type Animal.
			 */
		Animal sparrow1 = new Sparrow(1, "M", 4);
		sparrow1.move();
		
			// that sparrow 1 can't invoke the fly method
			// this is because the variable type animal doesn't contain fly method 
		Sparrow sparrow2 = new Sparrow (1, "M", 4);
		
		sparrow2.move();
		sparrow2.Fly();
		
		Animal fish1 = new Fish (1, "M", 2);
		fish1.move();
		
			/*
			 * by having both fish and sparrow as variable type animal 
			 * you can invoke the moveAnimal method with either of them 
			 *
			 */
		
			// example of of using polymorphism
		moveAnimal(fish1);
		
		moveAnimal(sparrow2);
		
		Flyable flyingbird = new Sparrow (1, "M", 2);
		flyingbird.Fly(); // only method that can be called 
	}
	
	public static void moveAnimal (Animal animal) {
		animal.move();
	}
}
