package collectionexamples;

public class StringBuffExampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer name=new StringBuffer("lakshmisantepete");
	//	StringBuffer name2=new StringBuffer(); //StringBuilder is same as StringBuffer
		StringBuilder name2=new StringBuilder();
		System.out.println(name.hashCode());
		for(int i=0;i<name.length();i++) {
			name2.append(name.charAt(i));
			System.out.println(name2.hashCode());
		}
		System.out.println(name2);
		//Stringbuffer we replace but instring we can't
	}

}
