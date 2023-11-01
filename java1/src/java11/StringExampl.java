package java11;

import java.util.Arrays;

public class StringExampl {
	/*
	 * public static void main(String[] args) { String[] names=
	 * {"lakshmi","nagaveni","lakshman","krishna","sujatha","andhanaya"};
	 * Arrays.sort(names);//dictionary order sorted  and natural sorting -->>comparable interface
	 * for(int i=0;i<names.length;i++)
	 * { System.out.println(names[i]); } }
	 */
	public static void main(String[] args) {
		String[] names={"lakshmi","nagaveni","lakshman hk","krishna","sujatha"};
		MyComparator mc=new MyComparator();
		Arrays.sort(names,mc); //user defined sorting-->length wise sorting
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	}
}
