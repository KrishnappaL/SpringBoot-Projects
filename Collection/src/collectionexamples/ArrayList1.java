package collectionexamples;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("jayasurya");
		al.add(true);
		al.add(5.4f);
		al.add(45);
		for(Object ob:al) {
			try {
				String s=(String)ob;
				String s2=s.substring(0,1);
				if(s2.equalsIgnoreCase("a"));
					System.out.println(ob);
			}catch(ClassCastException cce) {
				
			}
		}

	}

}
