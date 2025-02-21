package linkedList;

public class LinkedListTester {

	private static LinkedList tester = new LinkedListImpl();

	public static void main(String[] args) {
		runLinkedListTests();

	}

	public static void runLinkedListTests() {
		//Create (insert) 4 stations
		tester.addItem("Station 1");
		tester.addItem("Station 2");
		tester.addItem("Station 3");
		tester.addItem("Station 4");

		//List the stations
		tester.itemCount();
		tester.listItems();
				
				
		//Check if a station that exists is in the list (print result)
		tester.isItemInList("Station 2");
				
		//Check if a station that does NOT exists is in the list (print result)
		tester.isItemInList("Station 5");

		//Remove a station
		tester.deleteItem("Station 2");
		tester.listItems();
		
		//Add a station before another station
		tester.insertBefore("Station A", "Station 4");
		tester.listItems();

		//Add a station after another station
		tester.insertAfter("Station 5", "Station 4");
		tester.listItems();

	}

}
