package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExmpl4 {

	public static void main(String[] args) {
		ArrayList marks=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int i=0,total=0;
		while(true) {
			System.out.println("Enter mark:");
			int mark=sc.nextInt();
			marks.add(mark);
			total=total+(Integer)marks.get(i);//object convert to int
			i++;
		//	System.out.println("Enter N to stop");
		//	char ch=sc.next().charAt(0);//take 1st world in a line in that take 1st letter
		//	if(ch =='N')
		//		break;
			System.out.println("Enter STOP  to stop");
			String c=sc.next();//c is object because String is class
			if(c.equalsIgnoreCase("STOP")) { //compare two objects
				break;
			}
		}
		System.out.println(total);

	}

}
