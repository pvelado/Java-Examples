/*
 * Author: Paulo Velado
 * Disc: The program will simulate a deadlock situation from nested synchronized block. 
 * Both threads will be locked while trying to acquire a lock from another object so "Reached Here"
 * will never print.
 */

	// Test Class Prints name of test
class Test {
	private String name;
	public Test(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
	//Thread 1
/*
 * Thread "th1" will start execution of run method in "ThreadOne" and acquire lock on 
 * object "obj1" and then try to acquire lock on object "obj2".
 */
class ThreadOne implements Runnable {
	
	private Test obj1;
	private Test obj2;
	
	ThreadOne(Test obj1, Test obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void run() {
		synchronized (obj1) {
			System.out.println("" + obj1.getName());
			synchronized(obj2) {
				System.out.println("Reached here");
			}
		}
	}
}
	// Thread 2
/*
 * Thread "th2" will start execution of run method in "ThreadTwo" and acquire lock on object
 * "obj2" and then try to acquire lock on object "obj1". This causes deadlock.
 */
class ThreadTwo implements Runnable {
	
	private Test obj1;
	private Test obj2;
	
	ThreadTwo(Test obj1, Test obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
/*
 * Fix: To fix this deadlock, the order in which locks are acquired must match in both 
 * thread.
 */
	public void run() {
		synchronized (obj2) {  // Fix: switch "obj2" to "obj1"
			System.out.println("" + obj2.getName());
			synchronized(obj1) {// Fix: switch "obj1" to "obj2"
				System.out.println("Reached here");
			}
		}
	}
}

	// Main Method
public class Deadlock {
	
	public static void main (String[] args) {
		Test t1 = new Test ("Test One");
		Test t2 = new Test ("Test Two");
		
		Thread th1 = new Thread(new ThreadOne (t1, t2));
		Thread th2 = new Thread(new ThreadTwo (t1, t2));
		
		th1.start();
		th2.start();
	}

}
