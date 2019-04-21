/*
 * Author: Paulo Velado
 * Desc: This Program is used to simulate a race condition. The Variable will serve as a shared resource.
 * Each thread will check the inventory count to ensure that an order can be filled. If the order can 
 * be filled then the inventory count will be decremented. If not the program will indicate item should 
 * be placed on backorder.Each thread will pause for 5 second so that the other thread can execute.
 */


public class RaceCondition implements Runnable {
	
	private int inventory = 1; // shared resource
	long pause = 5000;
	
	public static void main (String[] args) {
		RaceCondition rc = new RaceCondition();
		Thread firstThread = new Thread(rc, "First thread");
		Thread secondThread = new Thread(rc, "Second thread");
		firstThread.start();
		secondThread.start();
	}
	
	
	public void run() {
		
		if (inventory > 0) {
			try {
				System.out.println("Thread " + Thread.currentThread().getName() + " starting inventory: " + inventory);
				Thread.sleep(pause); // 5 sec pause
			}
			catch (InterruptedException e) {
				// no operation
			}	
			
			inventory--; // decrement inventory
			System.out.println("Thread " + Thread.currentThread().getName() + " ending inventory: " + inventory);
		}
		else {
			System.out.println("Need to backorder! Thread " + Thread.currentThread().getName() + " found inventory with: " + inventory);
		}
	}	
}

/*
* Issue will occur because both threads check and decide that the order can be filled out
*/