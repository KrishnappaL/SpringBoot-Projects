package collection;

import java.util.ArrayList;
//If String then only print
public class ArrayListExampl5 {
public static void main(String[] ar) {
	ArrayList al1=new ArrayList();
	al1.add(10);
	al1.add(20);
	al1.add("Lakshmi");
	al1.add("bindu");
	Mobiles m1=new Mobiles("Vivo",12000);
	//System.out.println(m1.getClass());
	al1.add(m1);
	ArrayList al2=new ArrayList();
	for(Object ob:al1) {
		if(ob.getClass().getSimpleName().contains("String"))
			al2.add(ob);
	}
	System.out.println(al2);
	for(Object o:al1) {
		if(o.getClass().getSimpleName().contains("Mobiles"))
			al2.add(o);
	}
	System.out.println(al2);
}
}
