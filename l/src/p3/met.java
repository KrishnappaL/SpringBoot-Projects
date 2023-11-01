package p3;

public class met {
	int price;
met()
{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		met sl=new met();
		sl.price=100;
		System.out.println(sl);
		//String s=new String();
		//System.out.print(s);
		System.out.println(sl.hashCode());
		met sl2=new met();
		sl2.price=100;//200
		//sl2-->every child object is parent of object class
		if(sl.equals(sl2)) {//sl call the equal-->current object
			System.out.println("both are equal");
		}
		else System.out.println("not equal");

		
	}
	
		public boolean equals(Object o) {
			met s=(met)o;//object o super class is converted to child class object--type conversion also  happened
			if(this.price==s.price)
				return true;
			else
				return false;
		}
		public String toString() {
			return "hi";
		}
		public int hashCode() {
			return 123;
			
		}
	}


