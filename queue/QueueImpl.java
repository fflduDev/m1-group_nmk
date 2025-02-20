package queue;

public class QueueImpl implements Queue {
	
	private String[] ridersQueueArray;
	private int front;
	private int rear;
	private int size;
	private int capacity;
	
	
	@Override
	public boolean isFull() {
		return size == capacity; // size will always == capacity --> always full
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
			rear = (rear + 1) % capacity;
			ridersQueueArray[rear] = element;
			size++;
		}
	}

	@Override
	public String deQueue() {
		if(isEmpty()){
			System.out.println("Queue is empty and nothing can be removed");
			return null;
		}else {
			String deQueuedRider = ridersQueueArray[front];
			front = (front +1 ) % capacity;
			size--;
			return deQueuedRider;
		}
	}

	@Override
	public void display() {
		if(isEmpty()) {
			System.out.println("The stack is empty.");
		} else {
			for(int i = 0; i <= size; i++) {
				System.out.println(ridersQueueArray[(front + i) % capacity]);
	        	}
	        System.out.println();
			}
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
