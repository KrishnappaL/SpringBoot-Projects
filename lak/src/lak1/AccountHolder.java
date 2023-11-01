package lak1;

public class AccountHolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		//System.out.printn(b.minimumbalance);
	//	b.minimumbalance=100;-->memory reallocate in bank if you want print and check 
		int min=b.getminimumbalance();//getter method also pojo class
		System.out.println(min);
		b.setminimumbalance(3000);
		min=b.getminimumbalance();
		System.out.println(min);
	}

}
