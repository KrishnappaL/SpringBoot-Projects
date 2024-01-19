package collection;

import java.util.ArrayList;

public class ArrayListExample {
//collection->collection is a object represent group of objects
	public static void main(String[] args) {
		ArrayList  a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		ArrayList b=new ArrayList();
		b.add(50);
		b.add(60);
		b.add(70);//store 70 in 'b' object and 70 act as Integer object
		b.add(80);
		a.addAll(2,b);//index 2 position the element is added
		System.out.println("After adding b"+a);
		ArrayList c=new ArrayList();
		c.addAll(a);
		c.addAll(b);
		System.out.println("the c is"+c);
		System.out.println(c.contains(600));
		System.out.println(c.containsAll(b));
		c.add(3,123);//3rd position ge element 123 is added
		c.add(0,"abcd");
		System.out.println("the index -->"+c.get(0));  //return type object
		Object ob=c.get(0);
		Integer i=(Integer)ob; //Type casting That is convert Object to Integer Its called as parent class object convert to child class object
	//	System.out.println(i%2==0); //It shows error because we can't directly convert String to Integer i,e 1st apply the parseing 
		//Why we convert  Object to Int? -->for sum operations
		long[] arr= {10,23,34};
		//for-each loop  ==>Printing each element of array
		for(long aa:arr) { 
			System.out.println(aa);
		}
		for(Object o:c) {  //because collection store only object
			//o is a variable represent object
			Integer no=(Integer)o;//Type casting
			if(no%2==0)
				System.out.println(o);
		}
	}
}

