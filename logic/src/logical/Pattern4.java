package logical;

import java.util.Scanner;

public class Pattern4 {

	/*
	 * public static void main(String[] args) { int row=5,line,star;
	 * for(line=1;line<=row;line++) { for(int space=line;space<row;space++) {
	 * System.out.print("  "); } for(star=1;star<=2*line-1;star++) { if(star==1 ||
	 * star==(2*line-1) ||line==row ) { System.out.print("* "); } else
	 * System.out.print("  "); } System.out.println(); }
	 * for(line=row-1;line>0;line--) { for(int space=line;space<row;space++) {
	 * System.out.print("  "); } for(star=1;star<=2*line-1;star++) { if(star==1 ||
	 * star==2*line-1 || star==4) { System.out.print("* "); } else
	 * System.out.print("  "); } System.out.println(); } }
	 */
	/*
	 * public static void main(String[] args) { int n=8; for(int i=0;i<n;i++) { int
	 * no=1; System.out.printf("%"+ (n-i)*2 +"s",""); for(int j=0;j<=i;j++) {
	 * System.out.printf("%4d", no); no=no*(i-j)/(j+1); } System.out.println();
	 * 
	 * } }
	 */
	/*
	 * public static void main(String[] args) { int n,i; for(i=1;i<=4;i++) { n=8;
	 * for(int j=1;j<=n-i;j++) { System.out.print(" "); } for(int k=i;k>=1;k--) {
	 * System.out.print(k); } for(int I=2;I<=i;I++) { System.out.print(I); }
	 * System.out.println(); } for(i=3;i>=1;i--) { n=7; for(int j=0;j<=n-i;j++) {
	 * System.out.print(" "); } for(int k=i;k>=1;k--) { System.out.print(k); }
	 * for(int I=2;I<=i;I++) { System.out.print(I); } System.out.println(); } }
	 */
//	public static void main(String[] b) {
//		System.out.println("Enter number of rows:");
//		Scanner sc=new Scanner(System.in);
//	int row=	sc.nextInt();
//	for(int line=1;line<=row;line++) {
//		for(int no=1;no<=line;no++) {
//			System.out.print(line +" ");
//		}
//		System.out.println();
//	}
//	}
	/*
	 * public static void main(String[] args) {
	 * System.out.println("Enter a number of rows"); Scanner sc =new
	 * Scanner(System.in); int row=sc.nextInt(); for(int line=row;line>0;line--) {
	 * for(int n=row;n>=line;n--) { System.out.print(n+" "); } System.out.println();
	 * }
	 * 
	 * }
	 */
	/*
	 * public static void main(String[] args) {
	 * System.out.println("Enter a number of rows"); Scanner sc=new
	 * Scanner(System.in); int row=sc.nextInt(); for(int line=1;line<=row;line++) {
	 * for(int n=line;n>=1;n--) { System.out.print(n+" "); } System.out.println(); }
	 * }
	 */
	

	/*
	 * public static void main(String[] args){ Scanner sc=new Scanner(System.in);
	 * int r=sc.nextInt(); for(int line=1;line<=r;line++){ for(int n=1;n<=8;n++){
	 * if(n%2==0) System.out.print("0"); else System.out.print("1"); }
	 * System.out.println(); }
	 * 
	 * }
	 */
	/*
	 * public static void main(String args[]) { for(int line=1;line<=6;line++) {
	 * if(line%2==0) { for(int j=1;j<=6;j++) { if(j%2==1) System.out.print("0");
	 * else System.out.print("1"); } System.out.println(); } else { for(int
	 * j=1;j<=6;j++) { if(j%2==0) System.out.print("0"); else System.out.print("1");
	 * } System.out.println(); } } }
	 */
	/*
	 * public static void main(String[] args) { for(int line=1;line<=8;line++) {
	 * for(int j=1;j<=line;j++) { if(j%2==0) System.out.print("0"); else
	 * System.out.print("1"); } System.out.println(); } }
	 */
	/*
	 * import java.util.*; class pattern{
	 */

	   /*   public static void main(String[] args){
	       
	        for(int line=1;line<=7;line++){
	            for(int n=1;n<=8;n++){
	                if(n%2==0)
	                    System.out.print("0");
	                else
	                    System.out.print("1");
	            }
	            System.out.println();
	            sc.close();
	        }
	    }*/
		/*
		 * public static void main(String[] args){ for(int line=1;line<=10;line++){
		 * for(int space=1;space<=line;space++){ System.out.print(" "); } for(int
		 * n=line;n<=10;n++){ System.out.print(n+" "); } System.out.println(); } for(int
		 * line=9;line>=1;line--){ for(int space=line;space>=1;space--){
		 * System.out.print(" "); } for(int no=line;no<=10;no++){
		 * System.out.print(no+" "); } System.out.println(); } }
		 */
	public static void main(String[] args) {
		for(int line=1;line<=8;line++) {
			for(int no=1;no<=line;no++) {
				System.out.print(no+" ");
			}
			System.out.println();
		}
		for(int line=7;line>=1;line--) {
			for(int no=1;no<=line;no++) {
				System.out.print(no+" ");
			}
			System.out.println();
		}
	}
	}


