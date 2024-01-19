package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet  hs=new 	LinkedHashSet();
		hs.add(true);
		hs.add(10);
		hs.add("hi");
		hs.add(5.4f);
		hs.add("abcd");
		hs.add('c');
	//	System.out.println(hs);//insertion order maintained
		
		//frequency of each element in array
		ArrayList al=new ArrayList();
		al.add('h');
		al.add('a');
		al.add('r');
		al.add('i');
		al.add('s');
		al.add('h');
		LinkedHashSet  s=new 	LinkedHashSet(al);
		System.out.println(s);
		
	}

}
