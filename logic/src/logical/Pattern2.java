package logical;

public class Pattern2 {

	/*
	 * public static void main(String[] args) { for(int line=1;line<=5;line++ ) {
	 * for(int star=0;star<5;star++) { System.out.print(line); }
	 * System.out.println(); } }
	 */
	/*
	 * public static void main(String[] args) { int n=1;
	 * 
	 * for(int line=1;line<=6;line++) { for(int no=1;no<=line;no++) {
	 * System.out.print(n+" ");n=n+1; } System.out.println(); } }
	 */
	/*
	 * public static void main(String[] bcd) { for(int line=1;line<=6;line++) {
	 * for(int no=1;no<=line;no++) { if((line+no)%2==0) System.out.print(1+" ");
	 * else System.out.print(0+" "); } System.out.println(); } }
	 */
	/*
	 * public static void main(String[] args) { int j; for(int
	 * line=1;line<=6;line++) { for(j=1;j<=6-line;j++) { System.out.print("  "); }
	 * for(int second=line;second>=1;second--) { System.out.print(second+" "); }
	 * for( j=2;j<=line;j++) { System.out.print(j+" "); } System.out.println(); } }
	 */
	/*
	 * public static void main(String[] args) { for(int line=1;line<=5;line++) {
	 * for(int space=1;space<=6-line;space++) { System.out.print("  "); } for(int
	 * star=1;star<=5;star++) { System.out.print("* "); } System.out.println(); } }
	 */
	/*
	 * public static void main(String[] args) { for(int line=1;line<=6;line++) {
	 * for(int star=1;star<=7-line;star++) { System.out.print("*" ); }
	 * System.out.println(); } }
	 */
	/*
	 * public static void main(String[] b) { for(int line=1;line<=6;line++) {
	 * for(int space=1;space<line;space++) { System.out.print(" "); } for(int
	 * star=1;star<=6-line;star++) { System.out.print("*"); } System.out.println();
	 * } }
	 */
	public static void main(String a[]) {
		for(int line=1;line<=5;line++) {
			for(int space=5;space>line;space--) {
				System.out.print("  ");
				
			}
			for(int star=1;star<=line;star++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
	}
	
}
