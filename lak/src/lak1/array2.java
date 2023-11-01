package lak1;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[][] marks=new int[8][];
 marks[0]=new int[5];//zero row have 5 columns
 //System.out.println(marks[0].length);
 marks[0]=new int[5];//zero row have 5 columns
 marks[1]=new int[7];//first row have 7 columns
 System.out.println(marks[0].length);

//jagged array
 int row=0;
 while(row<marks.length)
 {
	 int col=0;
	 while(col<marks[row].length)
	 {
		 marks[row][col]=1;
	 	 col++;
	 }
	 row++;
 }
 for(int i=0;i<marks.length;i++)
 {
 for(int j=0;j<marks[0].length;j++)
 {
 	System.out.print(marks[i][j]+" ");
 }
 System.out.println();
 }
	}
}

 
 
	


