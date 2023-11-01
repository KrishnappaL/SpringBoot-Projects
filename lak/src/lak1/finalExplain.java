package lak1;

public class finalExplain {
//once we initialize we can't reassingn in same class and other class
	final int pocket_money=10;//non static-final and only this line we can edit and change the value
	static int cash=100;
	static final int sa=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalExplain f=new finalExplain();
		System.out.println(f.pocket_money);
//		f.pocket_money=100;//we can't override final variable
		f.study();
		finalExplain.cash=10;//we can change the value
		finalExplain.sa=12;//error
		
	}
	public final void study()
	{
		System.out.println(" is must");
	}

}
//final we gave anywhere