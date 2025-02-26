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
		queueTester.enQueue("John");
		queueTester.enQueue("Sarah");
		queueTester.enQueue("Ana");
		queueTester.enQueue("Maria");
		queueTester.enQueue("Richard");
		queueTester.enQueue("James");

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
		queueTester.enQueue("Alex");
		queueTester.enQueue("Pam");

		// Peek at the queue & print the result
		System.out.println("Peeking at first element in Queue:");
		queueTester.peek();

		// Remove the head & print the result
		System.out.println("\nRemoving first element in Queue: ");
		queueTester.deQueue();
		queueTester.display();

	}

}
