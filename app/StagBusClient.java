package app;

import linkedList.LinkedListTester;
import queue.QueueTester;
import stack.StackTester;

public class StagBusClient {

	public static void main(String[] args) {
		// create implementation, then

		System.out.println("-----L I S T  T E S T------");
		LinkedListTester.runLinkedListTests();

		System.out.println("-----S T A C K  T E S T------");
		StackTester.runStackTests();

		System.out.println("----Q U E U E  T E S T-------");
		QueueTester.runQueueTests();
	}

}
