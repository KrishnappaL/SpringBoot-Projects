package logical;

public class SingletoneDemo {
	static SingletoneDemo sd;
	public static void main(String[] args) {
		sd=new SingletoneDemo();
		sd.test();
		sd.display();
	}
	private SingletoneDemo(){
		
	}
	public  void test() {
		
	}
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
