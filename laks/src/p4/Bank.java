package p4;
//has - a relationship
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank customer=new Bank();
		customer.deposit(-100);
	}

	private void deposit(int amt) {
		// TODO Auto-generated method stub
		if(amt>0) {
			System.out.println("Go head");
		}
		else {
			//AmountException ae=new AmountException();
			//throw ae;
			throw new AmountException2();//anonymous object create directly when 
			}
	}

}
