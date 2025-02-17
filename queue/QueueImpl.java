package queue;

public class QueueImpl implements Queue {
	
	private String[] ridersQueueArray;
	private int front;
	private int rear;
	private int size;
	private int capacity;
	
	
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
		if(isFull()) {
			System.out.println("Queue is full and nothing can be added");
			return;
		}else{
			front++;
			rear = (rear + 1) % capacity;
			ridersQueueArray[rear] = element;
		}
	}

	@Override
	public String deQueue() {
		if(isEmpty()){
			System.out.println("Queue is empty and nothing can be removed");
			return null;
		}else {
			String deQueueRider = ridersQueueArray[front];
			front = (front+1)%capacity;
		}
		return null;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String peek(){
		if(isEmpty()) {
			return null;
		}else {
			System.out.println(ridersQueueArray[front]);
		}
		return null;
	}

}
