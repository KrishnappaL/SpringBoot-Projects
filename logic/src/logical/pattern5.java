package logical;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int line=1;line<=9;line++) {
			for(int n=9;n>=line;n--) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}

}
