package p3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validator {

	public static void main(String[] args) {
		String mobile="06784389833";
		Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");//the flower bracket 9 tell 0-9 will have 9 times
		Matcher m=p.matcher(mobile);
		if(m.find())
			System.out.println(m.group() + " is a valid no.");
		else
			System.out.println(mobile +" is not a valid no");

	}

}
