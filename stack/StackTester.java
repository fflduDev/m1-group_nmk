package stack;

public class StackTester {

	private static Stack stackTester = new StackImpl();

	public static void main(String[] args) {
		runStackTests();

	}

	public static void runStackTests() {
		// setting capacity
		stackTester.setCapacity(8);

		// Create (push) 6 riders by name & Iterate over the stack, print all riders
		stackTester.push("John");
		stackTester.push("Sarah");
		stackTester.push("Ana");
		stackTester.push("Maria");
		stackTester.push("Richard");
		stackTester.push("James");
		stackTester.display();

		// Peek at the stack / print the result
		System.out.println("Peeking at the top element: ");
		stackTester.peek();

		// Remove (pop) the top of the stack & Iterate over the stack, print all riders
		System.out.println("Popping the top element: ");
		stackTester.pop();
		stackTester.display();

		// Peek at the stack / print the result
		System.out.println("Peeking at the top element: ");
		stackTester.peek();

		// Add two more riders to the stack
		stackTester.push("Alex");
		stackTester.push("Pam");

		// Peek at the stack & print the result
		System.out.println("Peeking at the top element: ");
		stackTester.peek();

		// Remove all riders from the stack
		stackTester.pop();
		stackTester.pop();
		stackTester.pop();
		stackTester.pop();
		stackTester.pop();
		stackTester.pop();

		// Verify the stack is now empty (print that result)
		stackTester.pop();
		stackTester.display();

	}

}
