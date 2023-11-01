package p3;

public class Child extends Parent{

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch=new Child();
		ch.play();
		ch.read();
		ch.work();
		ch.watchTV();
		System.out.println(ch.salary);
	}

	public void read() {
		// TODO Auto-generated method stub
		System.out.println("reading");
		
	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("playing");
	}

}
