package lak1;

class array{
public static void main(String args[]){
int[][] ar=new int[3][3];
//Scanner sc=new Scanner(System.in);
int row=0;
int val=1;
System.out.println("row length:"+ar.length);
System.out.println(ar[0].length + "Column length");
//zero row have 3 colimns
while(row<3)
{
	int col=0;
do
{
ar[row][col]=val;
val+=1;
col++;
}while(col<3);

row++;
}
int total=0;
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
total=total+ar[j][i];
	System.out.print(ar[j][i]+" ");

}
System.out.println();
System.out.println("column total "+ total);

}

}
}
