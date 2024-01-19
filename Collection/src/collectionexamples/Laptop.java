package collectionexamples;

public class Laptop {

	private int price;

	public Laptop(int price) {
		// TODO Auto-generated constructor stub
		this.price=price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Laptop lap1=new Laptop(25000);//lap1 calls equal method
Laptop lap2=new Laptop(26000);
System.out.println(lap1.equals(lap2));
	}
public boolean equals(Object ob) { //ob=lap2 assigned and its a overriden method from obje class
	//lap2 act as a parent here
	System.out.println(this.price);//lap1
	Laptop ll=(Laptop)ob;//lap2 
	System.out.println(ll.price);
	if(this.price>ll.price)
		return true;
	else
		return false;
}
}
