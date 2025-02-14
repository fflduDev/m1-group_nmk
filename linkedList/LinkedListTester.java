package linkedList;

public class LinkedListTester {

	private static LinkedList tester = new LinkedListImpl();

	public static void main(String[] args) {
		runLinkedListTests();

	}

	public static void runLinkedListTests() {
		tester.addItem("First");
		tester.addItem("Second");
		tester.addItem("Third");

		tester.itemCount();

		tester.isItemInList("Fourth");

		tester.listItems();

		tester.deleteItem("Second");

		tester.insertAfter("Fifth", "Third");

		tester.insertBefore("Fourth", "Fifth");

		tester.itemCount();
		tester.listItems();

	}

}
