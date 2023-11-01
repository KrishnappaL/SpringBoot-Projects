package p3;

import java.util.StringTokenizer;

public class TokeninRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringTokenizer st=new StringTokenizer("Payilagam chenai");
		//StringTokenizer st=new StringTokenizer("www.youtube.com",".");//specify dot as delimiter
		//StringTokenizer st=new StringTokenizer("26-09-23","-");
		StringTokenizer st=new StringTokenizer("26-09-23","-",true);

		//System.out.println("Count of tokens"+ st.countTokens());
		/*while(st.hasMoreTokens())
			System.out.println(st.nextToken());//use space as default delimiter-StringTokenizer
	*/
		String sen="https:\\www.youtube.com";
		String[] str=sen.split("\\:|\\\\|\\.");///using :,\\ and . as delimiter
		for(String s:str) System.out.println(s);
	}


}
