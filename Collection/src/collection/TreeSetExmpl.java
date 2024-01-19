package collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetExmpl {

	public static void main(String[] args) {
		/*
		 * // Homogeneous element--ClassCastException it comes compile time 
		 * TreeSet hs=new TreeSet();//Order using dictionary(lexicon) not length matter
		 * hs.add("kavya"); hs.add("bavya"); hs.add("bhuvan");
		 */
//System.out.println(hs);
		ArrayList kapil=new ArrayList();
		kapil.add("KapilDev");
		kapil.add(150);
		kapil.add(23);
		kapil.add(45.4f);
		kapil.add(50);
		kapil.add(true);
		kapil.add(true);
		kapil.add(false);
		int total=0;
		for(Object score:kapil) {
			try {
				//type casting:Parent object to Child object
		//	System.out.println((Integer)score);
				Integer sc=(Integer)score;
				if(sc>=50) {
					total=total+sc;//auto unboxing-->Storing Integer object in int variable
					System.out.println(score);
				}
				
			}catch(ClassCastException cce) {
				
			}
			
		}
		System.out.println(total);
	}

}
