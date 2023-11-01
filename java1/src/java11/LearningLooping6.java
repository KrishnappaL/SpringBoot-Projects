package java11;

public class LearningLooping6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearningLooping6 ll = new LearningLooping6();
		//ll.find_fact(4);
		ll.swap();
	}

	private void swap() {
		int a=50,b=5;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+ a +" b="+b );
	}

	private void find_fact(int no) {
		int fact = 1;
		while (no > 0) {
			fact = fact * no;
			no = no - 1;
		}
		System.out.println("Factorial is " + fact);

	}

}
