package p3;

import java.util.regex.Pattern;

//explain both string and pattern class split method
public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sen="Payilagam chenai tamil nadu";//string class
		String sen2="www.pailagam.com";
		/*
		 * String[] st=sen.split("\\s"); String[] st=sen2.split("\\."); for(String s:st)
		 * System.out.println(s);
		 */
		//Pattern p=Pattern.compile("\\s");
		//Pattern p=Pattern.compile("\\.");
		Pattern p=Pattern.compile("a");
		String[] st2=p.split(sen);
		//String[] st2=p.split(sen2);
		for(String s:st2)
			 System.out.println(s);
		
	}

}
