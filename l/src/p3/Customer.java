package p3;

public class Customer {
static String name="Lakshmi";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankB b=new BankB();
		System.out.println(b.name);
		System.out.println(b.doono);
		System.out.println(b.interest);
		System.out.println(b.open);
	System.out.println(name);
		//String result=System.out.println("Lakshmi");//using variable more than once then only create variable
	
		System.out.println(b.openAccount("Lakshmi"));//comprehension of method calling
		BankB.declareHolidays();
		b.openAccount("Lakshmi",12345);
		b.openAccount("Lakshmi",2345,"lakshmi@gmail.com");
		//b.openAccount("Lakshmi",456,"laba@gmail.com",453,"abcd@gmail.com");-->method overloading drawback
	}

}
