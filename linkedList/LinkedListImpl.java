package linkedList;

public class LinkedListImpl implements LinkedList {
	ListItem head;

	@Override
	public Boolean isItemInList(String thisItem) {
		if (head == null) {
			System.out.printf("Item '%s' does not exist in the LinkedList.\n", thisItem);
			return false;
		}

		ListItem current = head;
		while (current != null) {
			if (current.data.equals(thisItem)) {
				System.out.printf("Item '%s' exists in the LinkedList.\n", thisItem);
				return true;
			}
			current = current.next;
		}

		System.out.printf("Item '%s' does not exist in the LinkedList.\n", thisItem);
		return false;
	}

	@Override
	public Boolean addItem(String thisItem) {
		if (thisItem == null) {
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
		return count;
	}

	@Override
	public void listItems() {
		ListItem current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	@Override
	public Boolean deleteItem(String thisItem) {

		if (head == null) {
			return false;
		}

		if (head.data.equals(thisItem)) {
			head = head.next;
			return true;
		}

		ListItem current = head;
		while (current.next != null) {
			if (current.next.data.equals(thisItem)) {
				current.next = current.next.next;
				return true;
			}
			current = current.next;

		}

		return false;
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {

		if (head == null) {
			return false;
		}

		ListItem current = head;
		while (current.next != null) {
			if (current.next.data.equals(itemToInsertBefore)) {
				ListItem prevNode = current;
				ListItem newNode = new ListItem(newItem);
				newNode.next = prevNode.next;
				prevNode.next = newNode;
				return true;
			}

			current = current.next;
		}

		return false;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {

		if (head == null) {
			return false;
		}

		ListItem current = head;
		while (current != null) {
			if (current.data.equals(itemToInsertAfter)) {
				ListItem newNode = new ListItem(newItem);
				newNode.next = current.next;
				current.next = newNode;
				return true;
			}

			current = current.next;
		}

		return false;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub

	}

}
