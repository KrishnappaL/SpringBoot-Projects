package logical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLearningDemo {

	public static void main(String[] args) {
		String sentence="default keyword also used in interface from this we access the methods in other classes";
		//System.out.println(sentence.length());
		Pattern p=Pattern.compile(sentence);
		Matcher m=p.matcher(sentence);
		while(m.find()) {
			System.out.println(m.group());//m.start(),m.end()
		}
	}

}
