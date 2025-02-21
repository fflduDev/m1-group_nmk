package stack;

public class StackTester {

	private static Stack stackTester = new StackImpl();

	public static void main(String[] args) {
		runStackTests();

	}

	public static void runStackTests() {
		// setting capacity
		stackTester.setCapacity(5);

		// testing isEmpty()
		stackTester.pop();

		// testing push()
		System.out.println("Pushing elements: ");
		stackTester.push("Rider 1");
		stackTester.push("Rider 2");
		stackTester.push("Rider 3");
		stackTester.display();

		// testing peek()
		System.out.println("Peeking at top element(Rider 3): ");
		stackTester.peek();

		// testing pop()
		System.out.println("Popping element(removing Rider 3): ");
		stackTester.pop();
		stackTester.display();

		// testing isFull()
		stackTester.push("Rider C");
		stackTester.push("Rider D");
		stackTester.push("Rider E");
		stackTester.display();

		stackTester.push("Rider F");

	}

}
