package p3;

public class BankB {
public String name="Indian Bank";
public int doono=10;
float interest=2.5f;
boolean open=true;
public BankB() {
	System.out.println("bank");
}
public void openAccount()
{
	System.out.println("account opening");
}
public String openAccount(String customerName)//method overloading
{
	System.out.println("account opening for" +customerName);
	return "Account created";
	
}
public static void declareHolidays()
{
	System.out.println("holidays list");
}
public void openAccount(String CustomerName, int mobile) {
	System.out.println("account opening "+CustomerName+ ":"+mobile);
}
public void openAccount(String CustomerName, int mobile, String gmail) {
	
	System.out.println("open account " +CustomerName+ " "+ mobile+" " + gmail);
}
}
