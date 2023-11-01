package p4;

public class AmountException2 extends RuntimeException{
public AmountException2(){
	System.out.println("Negative amount");
	display();
}
	public void display() {
	// TODO Auto-generated method stub
		System.out.println("abcd");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmountException2 a=new AmountException2();
	}

}

