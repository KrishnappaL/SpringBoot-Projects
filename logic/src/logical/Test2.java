package logical;

public class Test2 {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int gap=4;
	int output_count=5;
	if(gap<arr.length) {
		if(output_count<arr.length) {
			for(int i=0;i<output_count;i++) {
				int total=0;
				for(int j=i;j<arr.length;j=j+gap) {
					total=total+arr[j];
				}
				System.out.println(total);
			}
		}else System.out.println("enter output value between");
	}else System.out.println("enter a gap value between arr length");
	}

}
