package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExampl7 {

	public static void main(String[] args) {
		ArrayList  a=new ArrayList();
		a.add(100);
		a.add(20);
		a.add(104); //that is float value if we not gave f it take default double
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a);
		Collections.sort(a);
		int result=Collections.binarySearch(a, 20);
		System.out.println(result);
		ArrayList  al=new ArrayList();
		al.add("sabari");
		al.add("ganavi");
		al.add("anusha"); //that is float value if we not gave f it take default double
		al.add("suchitra");
		al.add("amruta");
		al.add("ranjitha");
		Collections.sort(al);
System.out.println(al);
		int rest =Collections.binarySearch(al, "ganavi");
		 System.out.println(rest);
	}

}
