package logical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexleadrningDemo2 {

	public static void main(String[] args) {
		String sentence="default keyword also used in interface from this we access the methods in other classes";
		Pattern p=Pattern.compile("keyword");
		Matcher m=p.matcher(sentence);
		while(m.find()) {
			System.out.println(m.group() + " start at "+ m.start() + " and ends at "+m.end());
		}
	}

}
