package collection;

public class Mobiles {

	 int price;
	 String brand;

	public Mobiles(String brand, int price) {
		// TODO Auto-generated constructor stub
		this.brand=brand;
		this.price=price;
	}

	public String toString() { //internally called and overrided
		return this.brand+" "+this.price;
	}

}
