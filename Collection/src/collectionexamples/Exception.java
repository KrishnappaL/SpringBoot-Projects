package collectionexamples;

public class Exception {

	/*
	 * public static void main(String[] args) { int no= display();
	 * System.out.println(no); }
	 * 
	 * private static int display() { // TODO Auto-generated method stub try {
	 * return 100; } catch(ArithmeticException ae) { return 10; } finally {
	 * System.out.println("hi"); } }
	 */
	public static void main(String args[]) {
		try {
			System.exit(0); //After exit in jvm it stop not move further
			//so exit() have high priority
			return 10;
		}catch(ArithmeticException e) {
			return 5;
		}
	}

}
