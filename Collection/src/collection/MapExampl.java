package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapExampl {

	public static void main(String[] args) {
		ArrayList<Mobiles> al=new ArrayList<Mobiles>();
		//al.add("sony"); al.add(160);
		HashMap hm=new HashMap();
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
		/*
		 * for(Object ob:s) { Entry entry=(Entry)ob; //
		 * System.out.println(entry.getKey()+ "-->" +entry.getValue());
		 * //System.out.println(ob); score +=(Integer)entry.getValue(); if(score==100) {
		 * System.out.println(entry.getKey()); } } System.out.println(score);
		 */
		/*
		 * int big=0; String name=""; for(Object b:s) { Entry entry=(Entry) b;
		 * score=(Integer) entry.getValue(); if(score>big) { big=score;
		 * name=(String)entry.getKey(); } } System.out.println(name +
		 * " scored highest "+ big);
		 */
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
