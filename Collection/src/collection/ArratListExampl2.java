package collection;

import java.util.ArrayList;

public class ArratListExampl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList  a=new ArrayList();
		a.add(100);
		a.add(true);
		a.add(104.4f); //that is float value if we not gave f it take default double
		a.add("Lakshmi");
		a.add(40);
		a.add("sabari");
		for(Object o:a) {
			try {
			Integer no=(Integer)o;
			System.out.println(no);
			}catch(ClassCastException cce) {
				
			}
		}
	}

}
