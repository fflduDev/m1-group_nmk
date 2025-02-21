package queue;

public class QueueImpl implements Queue {

	private String[] ridersQueueArray;
	private int front;
	private int rear;
	private int size;
	private int capacity;

	@Override
	public void setCapacity(int capacity) {
		this.capacity = capacity;
		this.ridersQueueArray = new String[capacity];
		this.size = 0;
		this.front = 0;
		this.rear = 0;

	}

	@Override
	public boolean isFull() {
		return size == capacity;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void enQueue(String element) {
		if (isFull()) {
			System.out.println("Queue is full, nothing can be added");
			return;
		} else {
			ridersQueueArray[rear] = element;
			rear = (rear + 1) % capacity;
			size++;
			System.out.println(element + " added to the Queue");
		}
	}

	@Override
	public String deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty, nothing can be removed");
			return null;
		} else {
			String deQueuedRider = ridersQueueArray[front];
			front = (front + 1) % capacity;
			size--;
			System.out.println(deQueuedRider + " removed from the Queue");
			return deQueuedRider;
		}
	}

	@Override
	public void display() {
		if (isEmpty()) {
			System.out.println("The Queue is empty.");
		} else {
			for (int i = 0; i < size; i++) {
				System.out.println(ridersQueueArray[(front + i) % capacity]);
			}
			System.out.println();
		}
	}

	@Override
	public String peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty, nothing can be peeked");
			return null;
		} else {
			System.out.println(ridersQueueArray[front]);
		}
		return ridersQueueArray[front];
	}

}
