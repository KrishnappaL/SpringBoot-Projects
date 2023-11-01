package lak1;

public class Child3 extends Parent3{
public Child3(int sal) {
		super(sal);
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Child3 p=new Child3(100);
	//this and super can't use main method because it is static method
	p.work();
	
	
}
//method overriding
public void work()
{
	super.work();
	//this.salary;-->it always first stattement thats why it shows error
	System.out.println("IT organization");
}
}
