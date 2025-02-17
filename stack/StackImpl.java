package stack; 

public class StackImpl implements Stack {

	private String[] ridersArray;
	private int top;
	private int capacity;
	
	
	
	@Override
	public void push(String s) {
		if(isFull()) {
			System.out.println(s+ "cannot be added to the stack");
		}else {
			ridersArray[top++] = s;
			System.out.println("rider added to stack: " + s);
		}
	}

	
	@Override
	public String pop() {
		if (isEmpty()) {
			return null;
		}else {
			String popRider = ridersArray[top--];
			System.out.println("Rider removed: "+popRider);
			return popRider;
		}
	}

	
	@Override
	public Boolean isEmpty() {
		return top == -1;
	}

	
	@Override
	public Boolean isFull() {
		return top == capacity - 1;
	}

	
	@Override
	public int size() {
		return top + 1;
	}

	
	@Override
	public String peek() {
		if (isEmpty()) {
			return null;
		}else {
			System.out.println("Peek Result: " + ridersArray[top]);
			return ridersArray[top];
		}
	}

	
	@Override
	public void setCapacity(int size) {
		this.capacity = size;
		this.ridersArray = new String[size];
		this.top = -1;
	}

	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
 

}
