package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList  a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		ArrayList b=new ArrayList();
		b.add(50);
		b.add(60);
		b.add(70);
		b.add(80);
		a.remove(0);
		a.addAll(b);
		a.retainAll(b);//only b elements present i,e a elements remove
		System.out.println(a);
	List l=	a.subList(0, 2);//take 0,1
	System.out.println(l);
	ArrayList  c=new ArrayList();
	c.add(10.1);
	c.add(20.2f);
	c.add("laks");
	c.add(true);
Object[] ob= c.toArray();//convert arraylist or list to array
for(Object val:ob) {	//each element different type so we use Object type
	System.out.println(val);
}
System.out.println(c.size()); //In array it called as length()
	
	}

}
