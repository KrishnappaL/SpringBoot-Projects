package p3;

public class Parent {
	public int salary=233;

public static void main(String[] args) {
	Parent p=new Parent();
	p.work();
	p.watchTV();
	System.out.println(p.salary);
}

protected void work() {
	// TODO Auto-generated method stub
	System.out.println("work");
	
}

public void watchTV() {
	// TODO Auto-generated method stub
	System.out.println("watching tv");
	
}
}
