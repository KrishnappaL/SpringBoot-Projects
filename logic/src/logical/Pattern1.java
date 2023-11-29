package logical;

import java.util.Scanner;

public class Pattern1 {

	/*
	 * public static void main(String[] args) {
	 * 
	 * int input = 4; // TODO Auto-generated method stub for (int row = 1, starCount
	 * = 1; row <= input; row++, starCount += 2) { for (int space = 1; space
	 * <=input-row; space++) { System.out.print(" "); } for (int i = 0; i <
	 * starCount; i++) { System.out.print("*"); } System.out.println(); }
	 * 
	 * }
	 */
	/*
	 * public static void main(String[] args) { for(int line=1;line<=6;line++){
	 * for(int space=line;space<=5;space++) System.out.print("  "); for(int
	 * star=1;star<=(2*line-1);star++) System.out.print("* "); System.out.println();
	 * } for(int line=5;line>0;line--) { for(int space=1;space<=6-line;space++)
	 * System.out.print("  "); for(int star=1;star<=(2*line-1);star++)
	 * System.out.print("* "); System.out.println(); } }
	 */
	/*
	 * public static void main(String[] args) {
	 * System.out.println("enter number of lines :"); Scanner sc=new
	 * Scanner(System.in); int row=sc.nextInt();
	 * 
	 * for(int line=1;line<=row;line++) { System.out.print(" "); for(int
	 * star=1;star<=line;star++) System.out.print("* "); System.out.println(); }
	 * for(int line=row-1;line>0;line--) { System.out.print(" ");
	 * 
	 * for(int star=1;star<=line;star++) System.out.print("* ");
	 * System.out.println(); } }
	 */
	public static void main(String[] args) {
		System.out.println("enter number of rows=");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		for(int line=1;line<=row;line++) {
			for(int space=1;space<=line;space++)
				System.out.print(" ");
			for(int star=line;star<=row;star++)
				System.out.print("* ");
			System.out.println();
		}
		for(int line=1;line<=row;line++) {
			for(int space=row;space>=line;space--)
				System.out.print(" ");
			for(int star=1;star<=line;star++)
				System.out.print("* ");
			System.out.println();
		}
	}
}