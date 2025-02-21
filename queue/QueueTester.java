package queue;

public class QueueTester {

	private static Queue queueTester = new QueueImpl();

	public static void main(String[] args) {
		runQueueTests();
	}

	public static void runQueueTests() {
		// setting capacity
		queueTester.setCapacity(5);

		// testing isEmpty()
		queueTester.peek();

		// testing enQueue()
		System.out.println("\nAdding elements to the Queue: ");
		queueTester.enQueue("Rider 1");
		queueTester.enQueue("Rider 2");
		queueTester.enQueue("Rider 3");
		queueTester.enQueue("Rider 4");
		queueTester.enQueue("Rider 5");

		// testing display()
		System.out.println("\nElements in Queue: ");
		queueTester.display();

		// testing peek()
		System.out.println("Peeking at first element in Queue:");
		queueTester.peek();

		// testing isFull()
		System.out.println();
		queueTester.enQueue("Rider 6");

		// testing deQueue()
		System.out.println("\nRemoving first element in Queue: ");
		queueTester.deQueue();
	}

}
