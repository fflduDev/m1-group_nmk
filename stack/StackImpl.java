package stack;

public class StackImpl implements Stack {

	private String[] ridersStackArray;
	private int top;
	private int capacity;

	@Override
	public void push(String s) {
		if (isFull()) {
			System.out.println("Stack is full, " + s + " cannot be added to the stack");
			return;
		} else {
			ridersStackArray[++top] = s;
			System.out.println("Rider added to stack: " + s);
		}
	}

	@Override
	public String pop() {
		if (isEmpty()) {
			System.out.println("This stack is empty and nothing can be popped");
			return null;
		} else {
			String popRider = ridersStackArray[top--];
			System.out.println("Rider removed: " + popRider);
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
			System.out.println("This stack is empty and nothing can be peeked");
			return null;
		} else {
			String peekRider = ridersStackArray[top];
			System.out.println("Peek Result: " + peekRider);
			return peekRider;
		}
	}

	@Override
	public void setCapacity(int size) {
		this.capacity = size;
		this.ridersStackArray = new String[size];
		this.top = -1;
	}

	@Override
	public void display() {
		if (isEmpty()) {
			System.out.println("The stack is empty.");
		} else {
			for (int i = 0; i <= top; i++) {
				System.out.println(ridersStackArray[i]);
			}
			System.out.println();
		}
	}

}
