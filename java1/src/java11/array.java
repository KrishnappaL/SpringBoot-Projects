package java11;

import java.util.Scanner;

//array occupies continues memory location
public class array {

	public static void main(String[] args) {
		int ar[] = new int[5];//in [] with in brackets we gave integer only
		boolean ar2[]=new boolean[5];//false
		char ar1[]=new char[5]; //empty space
		String ar3[]=new String[5];	//null
		array ar4[]=new array[5];

	/*
	 * Scanner sc = new Scanner(System.in); //runtime input int i = 0; while (i < 5)
	 * { System.out.print("enter a value: "); ar[i] = sc.nextInt(); i++; }
	 * 
	 * int i = 0; while (i < 5) { System.out.print(ar[i] + " "); //take default
	 * false i++; }
	 */
		//unused memory present-->fixed memory sized
		String ar7[]=new String[532434];
		ar7[0]="abc";
		ar7[1]="bcd";
		for(int j=0;j<ar7.length;j++) {
			System.out.println(ar7[j]);
			//what is the purpose of new keyword? -->array act as object because memory allocated in runtime and new used  when object is present 
		}
	}
	//int ab;  -->ab is object
	//int ar[]=new int[5];-->ar is also object
	//the difference between object and variable is,object will access  methods and variable

}
