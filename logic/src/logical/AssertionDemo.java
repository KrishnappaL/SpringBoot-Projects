package logical;

import java.util.Scanner;

public class AssertionDemo {

		/*Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number ");
		int no=sc.nextInt();
		try {
			assert(no==10):test();
			
		}catch(AssertionError ae) {
			System.out.println("Assertion error occurred");
		}
		System.out.println("You enterd "+no);
	}

	private static  String test() {
		System.out.println("Assertion example");
		return null;
	}*/
		 
		    public static void main(String args[])
		    {
		    	 int age = 21;
		         assert age <= 18 : "Cannot Vote";
		         System.out.println("The voter's age is " + age);
		     }
		}
	


