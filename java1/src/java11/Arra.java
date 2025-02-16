package java11;

import java.util.Arrays;

public class Arra {

	public static void main(String[] args) {
		int[] ar= {5,6,7,8,9};
		int[] br= {5,6,7,8,9,12,13};
		int[] dr= {4,2,5,3,9,8};
		int result=Arrays.binarySearch(ar, 7);
		//System.out.println(result);
		int res=Arrays.compare(ar, br);
		//System.out.println(res);
		int[] cr=Arrays.copyOf(br, 3);
		for(int i=0;i<cr.length;i++) {
			//System.out.println(cr[i]);
		}
Arrays.sort(dr, 0, 5);
for(int i=0;i<dr.length;i++) {
	System.out.println(dr[i]);

	}

}
}
