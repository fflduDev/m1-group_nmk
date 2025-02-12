package linkedList;

public class LinkedListImpl implements LinkedList {
	ListItem head;

	@Override
	public Boolean isItemInList(String thisItem) {
		if (head == null) {
			return false;
		}

		ListItem current = head;
		while (current != null) {
			if (current.data.equals(thisItem)) {
				return true;
			}
			current = current.next;
		}

		return false;
	}

	@Override
	public Boolean addItem(String thisItem) {
		if (thisItem == null) {
			return false;
		}

		if (head == null) {
			head = new ListItem(thisItem);
			System.out.println("hello from addItem in LinkedListImpl - the item passed in: " + thisItem);
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

		System.out.println("hello from addItem in LinkedListImpl - the item passed in: " + thisItem);

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
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub

	}

}
