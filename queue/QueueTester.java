package queue;

public class QueueTester {

	private static Queue queueTester = new QueueImpl();

	public static void main(String[] args) {
		runQueueTests();
	}

	public static void runQueueTests() {
		// setting capacity
		queueTester.setCapacity(8);

		// testing isEmpty()
		queueTester.peek();

		// Create (enqueue) 6 riders by name
		System.out.println("\nAdding elements to the Queue: ");
		queueTester.enQueue("Rider 1");
		queueTester.enQueue("Rider 2");
		queueTester.enQueue("Rider 3");
		queueTester.enQueue("Rider 4");
		queueTester.enQueue("Rider 5");
		queueTester.enQueue("Rider 6");

		// print all riders
		queueTester.display();

		// Peek at the queue / print the result
		System.out.println("Peeking at first element in Queue:");
		queueTester.peek();

		// Remove (dequeue) the head of the queue
		System.out.println("\nRemoving first element in Queue: ");
		queueTester.deQueue();
		queueTester.display();

		// Add two more riders to the queue
		System.out.println();
		queueTester.enQueue("Rider 7");
		queueTester.enQueue("Rider 8");

		// Peek at the queue & print the result
		System.out.println("Peeking at first element in Queue:");
		queueTester.peek();

		// Remove the head & print the result
		System.out.println("\nRemoving first element in Queue: ");
		queueTester.deQueue();
		queueTester.display();

	}

}
