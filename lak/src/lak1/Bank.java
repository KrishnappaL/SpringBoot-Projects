package lak1;

public class Bank {
//int minimumbalance=2500;
	private int minimumbalance=2550;
	//no rule to gave getminimumbalance you gave anything but eclipse it automatically gave no typing so we use
	public int getminimumbalance() {//always return datatype present--getter method
		return this.minimumbalance;
	}
	//set the value of private variable using setter method
	public void setminimumbalance(int value)//no return datatype present always
	{
		if(value>2500)
			this.minimumbalance=value;//curent class variable and method calls
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
