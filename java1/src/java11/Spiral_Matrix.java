package java11;

public class Spiral_Matrix {

	public static void main(String[] args) {
		int[][] a = new int[4][4];
		
		int rs = 0, re = 3, cs = 0, ce = 3;
		int no = 1;
			int row = rs;
			for (int col = cs; col <= ce; col++) {
				a[row][col] = no;
				no++;
			}
			rs++;
			int col = ce;
			for (row = rs; row <= re; row++) {
				a[row][col] = no;
				no++;
			}
			ce--;
			row = re;
			for (col = ce; col >= cs; col--) {
				a[row][col] = no;
				no++;
			}
			re--;
			col = cs;
			for (row = re; row >= rs; row--) {
				a[row][col] = no;
				no++;
			}
		
			for (int rw = 0; rw < 4; row++) {
				for (int cl = 0; cl < 4; col++) {
					System.out.print(a[rw][cl] + "\t");

				}
				System.out.println();
			}
		
		
	}

}
