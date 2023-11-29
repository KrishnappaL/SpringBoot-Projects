package logical;

public class StringLearnings {

	public static void main(String[] bcd) {
		System.out.println(bcd.length);
		for(int i=0;i<bcd.length;i++) {
			System.out.println(bcd[i]);
		}
		/*
		 * // Without new object creation String bankName1="SBI";//literal
		 * System.out.println(bankName1.hashCode()); String bankName2="SBI";
		 * System.out.println(bankName2.hashCode()); String bankName3="SBI";
		 * System.out.println(bankName3.hashCode());
		 */
		String bankName1=new String("SBI");
		System.out.println(bankName1.hashCode());
		String bankName2=new String("SBI");
		System.out.println(bankName2.hashCode());
		String bankName3=new String("SBI");
		System.out.println(bankName3.hashCode());
		
		
	}

}
