package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExampl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("i");
		al.add("love");
		al.add("java");
		al.add("i");
		al.add("love");
		al.add("india");
		HashSet hs=new HashSet();
		for(Object ob:al) {
			boolean added=hs.add(ob);
			if(added==false) {
				System.out.println(ob);
			}
		}

	}

}
