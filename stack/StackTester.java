package stack;

public class StackTester {

	private static Stack stackTester = new StackImpl();

	public static void main(String[] args) {
		runStackTests();

	}

	public static void runStackTests() {
		// setting capacity
		stackTester.setCapacity(6);
		
		
		//Create (push) 6 riders by name & Iterate over the stack, print all riders
		stackTester.push("Rider 1");
		stackTester.push("Rider 2");
		stackTester.push("Rider 3");
		stackTester.push("Rider 4");
		stackTester.push("Rider 5");
		stackTester.push("Rider 6");
		stackTester.display();
		
		//Peek at the stack / print the result
		System.out.println("Peeking at top element(Rider 6): ");
		stackTester.peek();
		
		//Remove (pop) the top of the stack & Iterate over the stack, print all riders
		System.out.println("Popping element(removing Rider 6): ");
		stackTester.pop();
		stackTester.display();
		
		//Peek at the stack / print the result
		System.out.println("Peeking at top element(Rider 5): ");
		stackTester.peek();
		
		//Add two more riders to the stack
		stackTester.push("Rider 7");
		stackTester.push("Rider 8");
		
		//Peek at the stack & print the result
		System.out.println("Peeking at top element(Rider _): ");
		stackTester.peek();
		
		//Remove all riders from the stack
		stackTester.pop();
		stackTester.pop();
		stackTester.pop();
		stackTester.pop();
		stackTester.pop();
		stackTester.pop();
		
		
		//Verify the stack is now empty (print that result)
		stackTester.pop();


	}

}
