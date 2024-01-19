package collection;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapExampl2 {

	public static void main(String[] args) {
		
		LinkedHashMap hm=new LinkedHashMap();//maintains insertion order
		hm.put("sachin", 45);
		hm.put("dhoni", 55);
		hm.put("rohit", 85);
		hm.put("dhawan", 70);
		hm.put("kapil", 100);
		hm.put("rohit", 87);
		hm.put("rohit", 88);
	//	System.out.println(hm.keySet());
		//System.out.println(hm.values());
		//System.out.println(hm);
		//System.out.println(hm.entrySet()); set do not have indes so we can't use for loop
		Set s=hm.entrySet();
		int score=0;
		 
		System.out.println(hm.get("rohit"));
		Entry en=null;
		int big=0;
		String name="";
		for(Object b:s) {
			Entry entry=(Entry) b;
			score=(Integer) entry.getValue();
			if(score>big) {
				en=entry;
			}
		}
		System.out.println(en);
	}

}
