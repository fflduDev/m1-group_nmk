package linkedList;

public class LinkedListImpl implements LinkedList {
	ListItem head;

	@Override
	public Boolean isItemInList(String thisItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addItem(String thisItem) {
				
				
				if(head == null) {
					head = new ListItem(thisItem);
					return true;
				}
				
				ListItem current = head;
				while(current.next != null) {
					current = current.next;
				}
				current.next = new ListItem(thisItem);
				
				System.out.println("Hello World");				
				
		
		System.out.println("hello from addItem in LinkedListImpl - the item passed in: " + thisItem);
	
		return null;
	}

	@Override
	public Integer itemCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listItems() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean deleteItem(String thisItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		// TODO Auto-generated method stub
		return null;
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
