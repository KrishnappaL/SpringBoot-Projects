package lak1;

public class mobileshop {
public mobileshop(int price,int disc) {
	//this();--->it is stackoverflow because visibility not decrease
		System.out.println(price-disc);
		
	}

	public mobileshop() {
		this(8000,400);//it call  above costructor and first statement
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		mobileshop mobile1=new mobileshop();
		mobileshop mobile2=new mobileshop(10000,500);
	}
}