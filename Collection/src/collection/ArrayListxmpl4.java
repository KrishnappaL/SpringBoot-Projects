package collection;

import java.util.ArrayList;

public class ArrayListxmpl4 {

	public static void main(String[] args) {
ArrayList al=new ArrayList();
al.add("I");
al.add("Love");
al.add("Java");
/*
 * boolean present=al.contains("Java"); System.out.println(present);
 * if(present==true) { int position=al.indexOf("Java"); al.set(position,
 * "Python"); } System.out.println(al);
 */
for(int i=0;i<al.size();i++) {
	if(al.get(i).equals("Java")) {
		al.set(i, "Python");
	}
	System.out.println(al);
}
	}

}
