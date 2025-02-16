package java11;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Employee e1=new Employee("lakshmi",22,25000);
		Employee e2=new Employee("nagaveni",26,55000);
		Employee e3=new Employee("bindu",23,35000);
		Employee e4=new Employee("gunda",20,45000);
		Employee[] e= {e1,e2,e3,e4};
		MyComparator m=new MyComparator();
		Arrays.sort(e,m);
		for(int i=0;i<e.length;i++) {
			System.out.println(e[i]);
		}

	}

}
