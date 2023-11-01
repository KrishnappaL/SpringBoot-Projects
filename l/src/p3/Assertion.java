package p3;

import java.util.Scanner;

public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter any number");
		int no=sc.nextInt();
		//assert(no==10);-simple form
		assert(no==10):test();//-second form

			System.out.println("you entered"+no);
	}

	private static int test() {
		// TODO Auto-generated method stub
		return 12345;
	}

}
