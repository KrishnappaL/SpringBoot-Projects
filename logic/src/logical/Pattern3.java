package logical;

public class Pattern3 {

	/*
	 * public static void main(String[] args) { int i,j,n=8; for (i = 0; i<=n; i++)
	 * { // Inner for loop for logic execution for (j = 0; j<= n / 2; j++) { //
	 * prints two vertical lines if ((j == 0 || j == n / 2) && i != 0 || // print
	 * first line of alphabet i == 0 && j != n / 2 || // prints middle line i == n /
	 * 2) System.out.print("*"); else System.out.print(" "); } System.out.println();
	 * }
	 * 
	 * }
	 */
	/*
	 * public static void main(String[] args) { int i, j, k, rows=9; for (i=1; i<=
	 * rows ; i++) { for (j = i; j < rows ; j++) { System.out.print(" "); } for (k =
	 * 1; k <= (2*i -1) ;k++) { if(k==1 || i == rows || k==(2*i-1)) {
	 * System.out.print("*"); } else { System.out.print(" "); } }
	 * System.out.println(""); } }
	 */
	public static void main(String[] args)  
	{  
	int i, j, k, rows=9;     
	for (i=rows; i>= 1 ; i--)  
	{  
	for (j = i; j<rows ; j++)   
	{  
	System.out.print(" ");  
	}     
	for (k = 1; k <= (2*i -1) ;k++)   
	{  
	if( k==1 || i == rows || k==(2*i-1))   
	{  
	System.out.print("*");  
	}  
	else   
	{  
	System.out.print(" ");  
	}  
	}  
	System.out.println("");  
	}  
	}  

}
