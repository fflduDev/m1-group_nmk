package linkedList;

public class LinkedListImpl implements LinkedList {
	ListItem head;

	@Override
	public Boolean isItemInList(String thisItem) {
		if (head == null) {
			System.out.printf("Item '%s' does not exist in the List\n", thisItem);
			return false;
		}

		ListItem current = head;
		while (current != null) {
			if (current.data.equals(thisItem)) {
				System.out.printf("Item '%s' exists in the List\n", thisItem);
				return true;
			}
			current = current.next;
		}

		System.out.printf("Item '%s' does not exist in the List\n", thisItem);
		return false;
	}

	@Override
	public Boolean addItem(String thisItem) {
		if (thisItem == null) {
			System.err.println("Error adding item");
			return false;
		}

		if (head == null) {
			head = new ListItem(thisItem);
			System.out.println("Item added: " + thisItem);
			return true;
		}

		ListItem current = head;
		while (current != null) {
			if (current.data.equals(thisItem)) {
				return false;
			}
			if (current.next == null) {
				break;
			}
			current = current.next;
		}

		current.next = new ListItem(thisItem);

		System.out.println("Item added: " + thisItem);

		return true;

	}

	@Override
	public Integer itemCount() {
		Integer count = 0;
		ListItem temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}

		System.out.printf("%d item(s) in the List\n", count);
		return count;
	}

	@Override
	public void listItems() {
		System.out.println("Items in List:");
		ListItem current = head;
		while (current != null) {
			System.out.printf("- %s\n", current.data);
			current = current.next;
		}
	}

	@Override
	public Boolean deleteItem(String thisItem) {

		if (head == null) {
			System.out.println("Error deleting item");
			return false;
		}

		if (head.data.equals(thisItem)) {
			head = head.next;
			System.out.println("Item deleted: " + thisItem);
			return true;
		}

		ListItem current = head;
		while (current.next != null) {
			if (current.next.data.equals(thisItem)) {
				current.next = current.next.next;
				System.out.println("Item deleted: " + thisItem);
				return true;
			}
			current = current.next;

		}

		System.out.printf("Item '%s' could not be deleted\n", thisItem);
		return false;
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {

		if (head == null) {
			System.out.println("Item not inserted, List is empty");
			return false;
		}

		ListItem current = head;
		while (current.next != null) {
			if (current.next.data.equals(itemToInsertBefore)) {
				ListItem prevNode = current;
				ListItem newNode = new ListItem(newItem);
				newNode.next = prevNode.next;
				prevNode.next = newNode;
				System.out.println(String.format("Item '%s' inserted before '%s'", newItem, itemToInsertBefore));
				return true;
			}

			current = current.next;
		}

		System.out.printf("Item '%s' could not be inserted\n", newItem);
		return false;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {

		if (head == null) {
			System.out.println("Item not inserted, List is empty");
			return false;
		}

		ListItem current = head;
		while (current != null) {
			if (current.data.equals(itemToInsertAfter)) {
				ListItem newNode = new ListItem(newItem);
				newNode.next = current.next;
				current.next = newNode;
				System.out.println(String.format("Item '%s' inserted after '%s'", newItem, itemToInsertAfter));
				return true;
			}

			current = current.next;
		}

		System.out.printf("Item '%s' could not be inserted\n", newItem);
		return false;
	}

	@Override
	public void sort() { // extra credit
		// TODO Auto-generated method stub

	}

}
