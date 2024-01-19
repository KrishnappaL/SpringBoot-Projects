package collection;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetExmpl {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet l=new HashSet();
		l.add(100);
		l.add(200);
		l.add("Hi");
		l.add(true);
		HashSet l2=new HashSet();
		l2.add("siva");
		l2.add("stalin");
		l2.add("Anjali");
		l2.add("priyanka");
		l.addAll(l2);//===>We can pass both list and set as argument to addAll() so it is Collection arguement
System.out.println(l.contains("stalin"));
System.out.println(l2.size());
System.out.println(l2.contains("siva"));
System.out.println(l2.containsAll(l));
//System.out.println(l2.get(3));--->hashset don't have index
//System.out.println(l2.indexOf("stalin"));--->hashset don't have index
	}
}
