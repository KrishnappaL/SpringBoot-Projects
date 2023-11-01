package p3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuanRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ababsbaabbbcbs";
		Pattern p=Pattern.compile("a{1,3}");//("a?"); //("a*");//  a+
		Matcher m=p.matcher(s);
		while(m.find())
		{
			System.out.println(m.group()+" start at "+m.start());
		}
	}

}
