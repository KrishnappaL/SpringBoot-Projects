package p3;

public class supermarket {
int price;
float gst;
static int discount=10;
public supermarket(int p,float  g)
{
	price=p;
	gst=g;
	//System.out.println(price);
}
	public static void main(String[] args) {
		System.out.println(discount);
		supermarket s=new supermarket(30,3);//object specific values
		System.out.println(s.price);
		

	}

}
