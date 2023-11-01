package p3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * String sentence="I am Lakshmi coming from kunigal adn ssit studyied in ssit";
	 * Pattern p=Pattern.compile("ssit");//static method Matcher
	 * m=p.matcher(sentence); int count=0; while(m.find())//true or false { count++;
	 * 
	 * } //System.out.println(m.group()+ " start "+m.start()+" end "+m.end());
	 * System.out.println("ssit appears "+ count +" times"); }
	 */
public static void main(String[] args) {
	String sentence="KanadaKanadaian Karnataka 57344 %^%^&%&^";
	//Pattern p=Pattern.compile("\\s");//space
	//Pattern p=Pattern.compile("\\S");//except space all taken
	//Pattern p=Pattern.compile("\\d");//digits
	//Pattern p=Pattern.compile("\\D");//except digits
	//Pattern p=Pattern.compile("\\w");//except special characters
	//Pattern p=Pattern.compile("\\W");//only special characters
	//Pattern p=Pattern.compile("\\bKanad");//boundary
	//Pattern p=Pattern.compile("Kanada\\B");///end boundary
	//Pattern p=Pattern.compile("\\bKanada\\b");
	//Pattern p=Pattern.compile("\\GKannada");//group
	Pattern p=Pattern.compile(".");//take all characters include special symbols
	Matcher m=p.matcher(sentence);
	while(m.find()) {
		System.out.println(m.group()+ " start at "+m.start());
	}
}
}
