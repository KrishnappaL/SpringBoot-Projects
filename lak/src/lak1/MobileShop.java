package lak1;

public class MobileShop {
int discount;
	public MobileShop(int discount) {
		
		this();//call MoboileShop constructor explicitly in this constructor
		//we don't pass no arguments because there is no parameter in mobileshop constructor 
		System.out.println(discount);
	}

	public MobileShop() {

		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		MobileShop mobile1=new MobileShop();
		MobileShop mobile2=new MobileShop(5);
	}

}
