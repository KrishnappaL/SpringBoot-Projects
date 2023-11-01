package p3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * String str="Kanadda is oldest language"; //Pattern
	 * p=Pattern.compile("^Kannada");//caret-check kanadda is first word //Pattern
	 * p=Pattern.compile("language$");//$-check to last word Pattern
	 * p=Pattern.compile("l|a"); Matcher m=p.matcher(str); while(m.find()) {
	 * System.out.println(m.group()+" starts at "+m.start() +" end " +m.end() ); } }
	 */
//character class-take a or b or c
	public static void main(String[] args)
	{
		String sen="abCbcbd12345#$%^%^*&!@[]";
		//Pattern p=Pattern.compile("[abc]");
		//Pattern p=Pattern.compile("[^ab]");//except a and b
		//Pattern p=Pattern.compile("[a-z]");//a to z
		//Pattern p=Pattern.compile("[A-Z]");
		//Pattern p=Pattern.compile("[a-z A-Z]");//all alphabets
		Pattern p=Pattern.compile("[0-9]");
		//Pattern p=Pattern.compile("[a-z A-Z 0-9]");
		//Pattern p=Pattern.compile("[^a-z A-Z 0-9]");
		Matcher m=p.matcher(sen);
		
		while(m.find()) {
			System.out.println(m.group()+" starts "+ m.start());
		}
	}
}
