package queue;

public class QueueTester {
	
	private static Queue tester = new QueueImpl();

	public static void main(String[] args) {
		runQueueTests();
	}
	
	public static void runQueueTests() {
		//setting capacity
		//how do we set the capacity
		
		//testing isEmpty() 
		tester.deQueue();
		
		//testing enQueue()
		tester.enQueue("Rider 1"); //ERROR : output says "Queue is full and nothing can be added"
	

	}
	
	
		

}
