package java11;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		if (e1.salary > e2.salary)
			return -1;
		else if (e1.salary < e2.salary)
			return +1;
		else
			return 0;
		
	}

	/*
	 * @Override public int compare(Object o1, Object o2) { String s1=(String)o1;
	 * String s2=(String)o2; //Downcasting-->objects converting to string type
	 * if(s1.length()>s2.length()) return +1; else if(s1.length()<s2.length())
	 * return -1; else return 0;
	 * 
	 * }
	 */

}
