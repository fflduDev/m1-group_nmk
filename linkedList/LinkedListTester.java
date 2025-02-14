package linkedList;

public class LinkedListTester {

	private static LinkedList tester = new LinkedListImpl();

	public static void main(String[] args) {

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

	public static void runLinkedListTests() {
		TEST_addItem();

		TEST_itemCount();

		TEST_isItemInList();

	}

	public static void TEST_addItem() {
		tester.addItem("First");
		tester.addItem("Second");
		tester.addItem("Third");

	}

	public static void TEST_itemCount() {
		Integer count = tester.itemCount();
		System.out.printf("%d item(s) in the LinkedList.\n", count);
	}

	public static void TEST_isItemInList() {
		tester.isItemInList("Fourth");
	}

	public static void TEST_deleteItem() {

	}

}
