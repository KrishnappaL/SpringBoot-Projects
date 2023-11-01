package p3;

public class Customer2 {
	int aadharNo,dateOfBirth;
	String name,city;

	public Customer2(String CustomerName, int dob, int id, String cityName)
	{
	
		name=CustomerName;
		dateOfBirth=dob;
		aadharNo=id;
		city=cityName;
		System.out.println("I am checking for constructor");
	}
	public Customer2(int id) {
		aadharNo=id;
		System.out.println("Iam selvan constructor"+id);
	}
	public Customer2() {
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");
	}
	public static void main(String[] args) {
		Customer2 c2=new Customer2();
		Customer2 c=new Customer2("anbu",180723,1234,"madurai");//constructor overloading
		Customer2 selva=new Customer2(5678);//constructor overloading
		selva.applyLoan();
	}
	private void applyLoan() {
		// TODO Auto-generated method stub
		System.out.println("customer id:"+aadharNo);
		
	}

}
