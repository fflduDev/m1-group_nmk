package stack;

public class StackTester {
	

	public static void main(String[] args) {

		Stack stackTester = new StackImpl();
		runStackTests(stackTester);

	}
	
	public static void runStackTests(Stack stack) {
		//setting capacity
		stack.setCapacity(5);
		
		//testing isEmpty()
		stack.pop();
		
		//testing push()
		System.out.println("Pushing elements: ");
		stack.push("Rider 1");
		stack.push("Rider 2");
		stack.push("Rider 3");
		stack.display();
		
		//testing peek()
		System.out.println("Peeking at top element(Rider 3): ");
		stack.peek();
		
		//testing pop()
		System.out.println("Poping element(removing Rider 3): ");
		stack.pop();
		stack.display();
		
		//testing isFull()
		stack.push("Rider C");
		stack.push("Rider D");
		stack.push("Rider E");
		stack.display();
		
		stack.push("Rider F");		
	 	
	}

}
