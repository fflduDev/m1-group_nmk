package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// create implementation, then...

		LinkedList tester = new LinkedListImpl();
		tester.addItem("First");
		tester.addItem("Second");
		tester.addItem("Third");

		Integer numItems = tester.itemCount();
		System.out.println(numItems);

		boolean exists = tester.isItemInList("Fourth");

		if (exists) {
			System.out.println("Item exists");
		} else {
			System.out.println("Item does not exist");
		}

		tester.listItems();

		boolean deleted = tester.deleteItem("First");

		tester.listItems();

		boolean added = tester.insertBefore("TEST", "Third");

		tester.listItems();
	}

}
