package p4;
						//when checked exception --->compile time exception
public class Bank2 {

	public static void main(String[] args) throws AmountException {
		
		Bank2 customer=new Bank2();
	
	}

	private void deposit(int amt) throws AmountException    {
	
		if(amt>0) {
			System.out.println("Go head");
		}
		else {
			
			throw  new AmountException();
			}
	}

}

