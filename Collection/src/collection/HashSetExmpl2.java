package collection;

import java.util.HashSet;

public class HashSetExmpl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet hs=new HashSet();
hs.add(true);
hs.add(10);
hs.add("hi");
hs.add(5.4f);
hs.add("abcd");
hs.add('c');
hs.add('c');
System.out.println(hs);//No order maintained
	}

}
