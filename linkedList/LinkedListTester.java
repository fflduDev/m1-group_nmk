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

		if (deleted) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}

		tester.listItems();
	}

}
