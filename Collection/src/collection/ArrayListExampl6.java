package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExampl6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ls=new ArrayList();
		Scanner sc=new Scanner(System.in);
		/*
		 * while(true){ System.out.println("Enter mark: "); int mark=sc.nextInt();
		 * ls.add(mark);
		 * System.out.println("Do you want to proceed? If not enter stop"); String
		 * input=sc.next(); if(input.equals("stop")) break;
		 * 
		 * }
		 */
		while(true) {
			System.out.println("Enter mark:");
			String mark=sc.next();
			try {
				Integer i=Integer.parseInt(mark);//parse divide the thing and only provide int value
				ls.add(mark);
			}catch(ClassCastException  | NumberFormatException nne) {//exception occur when enter string object because we can't parse object to integer
				break;
			}
		}
		System.out.println(ls);
	}

}
