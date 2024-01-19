package collection;

import java.util.LinkedList;

public class LinkedListExampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add(100);
		l.add(200);
		l.add("Hi");
		l.add(true);
		LinkedList l2=new LinkedList();
		l2.add("siva");
		l2.add("stalin");
		l2.add("Anjali");
		l2.add("priyanka");
		l.addAll(l2);
System.out.println(l.contains("stalin"));
System.out.println(l2.size());
System.out.println(l2.contains("siva"));
System.out.println(l2.containsAll(l));
System.out.println(l2.get(3));
System.out.println(l2.indexOf("stalin"));
	}

}
