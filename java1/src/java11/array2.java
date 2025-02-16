package java11;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length");
		int len = sc.nextInt();
		int[] ar = new int[len];
		int total=0;
		for (int i = 0; i < ar.length; i++) {
			System.out.println("enter a value");
			ar[i] = sc.nextInt();
			 total=total+ar[i];
		}
			System.out.println(total);
			for(int i=0;i<ar.length;i+=2) {
				System.out.println(ar[i]);
			}
			for(int i=1;i<ar.length;i+=2) {
				System.out.println(ar[i]);
			}
		
	}

}
