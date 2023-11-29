package logical;

public class PatternDemo {

	public static void main(String[] args) {
		/*
		 * for(int line=5;line>=1;line--) { for(int no=1;no<line;no++) {
		 * System.out.print(" "); }
		 * 
		 * for(int no=1;no<=6-line;no++) { System.out.print("*"+" "); }
		 * System.out.println(); }
		 */
		/*
		 * for(int line=1;line<=5;line++) { for(int space=1;space<=5-line;space++) {
		 * System.out.print(" "); } for(int star=1;star<=line;star++) {
		 * System.out.print("* "); } System.out.println(); }
		 */
		/*
		 * for(int line=1;line<=5;line++) { for(int no=1;no<line;no++) {
		 * System.out.print(no+" "); } for(int star=1;star<=5;star++)
		 * System.out.print("* "); System.out.println();
		 * 
		 * }
		 */
		for(int line=1;line<=5;line++) {
			for(int no=1;no<line;no++) {
				System.out.print(" "+" " );//no," "
			}	
			for(int star=1;star<=6-line;star++)
			System.out.print("* ");
			System.out.println();

		}
	}
}



