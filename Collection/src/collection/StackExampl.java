package collection;

import java.util.ArrayList;
import java.util.Stack;

public class StackExampl {

	public static void main(String[] args) {
		Stack  a=new Stack();
		a.add(100);
		a.add(true);
		a.add(104.4f); //that is float value if we not gave f it take default double
		a.add("Lakshmi");
		a.add(40);
		a.add("sabari");
		for(Object ob:a) {
			System.out.println(ob);
		}
		String s="lakshmiIsGoodGirl";
		System.out.println(s.lastIndexOf("l"));
	}

}
