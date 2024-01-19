package collection;

import java.util.ArrayList;

public class ObjectClass {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Integer no=5;
		String name=no.getClass().getSimpleName();
		if(name.equals("String"))
			al.add(no);
		String s="abcd";
		name=s.getClass().getSimpleName();
		if(name.equals("String"))
			al.add(s);
		System.out.println(al);
	}

}
