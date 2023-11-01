package p4;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling eh=new ExceptionHandling();
		eh.divide();
		System.exit(1);

		System.out.println("check me");
	}

	private void divide() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter two numbers");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
	
		
		try {
		System.out.println(no1/no2);
		int[] ar= new int[no2];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		}
		
		
		catch(ArithmeticException ae) {
			ae.printStackTrace();					//easily find out where is exception occur
			System.out.println(ae.getMessage());		//what type of exception

			System.out.println("check number2. It should not be zero");
			no2=sc.nextInt();
			System.out.println(no1/no2);
		}
		catch(NegativeArraySizeException nae)
		{
			System.out.println("Array size should not be negative");
		}
		catch(Exception e) {
			System.out.println("Somethin went wrong");		//parent class object
			System.out.println(e.getClass());
		}
		finally{
			System.out.println("DB conneced");
			System.out.println("DB disconected");
		}
		System.out.println("hi heelo");
		
	}

}
//try finally catch --not possible
//try finally -->possible
//try catch finally -->possible