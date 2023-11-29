package logical;

public class Test {

	public static void main(String[] args) {
		int[] arr= {4,9,7,1,12};
		int x=4;
		int y=10;
		if(x<y) {
			int i=0;
			while(i<arr.length) {
				if(arr[i]>x && arr[i]<y) {
					System.out.println(arr[i]);
				}
				i++;
			}
		}else System.out.println("Condition mismatch");
	}

}
