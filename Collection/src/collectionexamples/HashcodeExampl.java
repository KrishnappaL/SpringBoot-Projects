package collectionexamples;

public class HashcodeExampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashcodeExampl hs1=new HashcodeExampl();
		HashcodeExampl hs2=new HashcodeExampl();
		System.out.println(hs1.hashcode());
		System.out.println(hs2.hashcode());
		System.out.println(hs1.equals(hs2));
		System.out.println(hs1.toString());

	}
//hashcode method overrided here
	private int hashcode() {
		return -123;
	}

}
