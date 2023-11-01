package lak1;
//explaining super and this in method overriding
public class Parent3  {
	int salary;
public static void main(String[] args)
{
	Parent3 p1=new Parent3(300);
	p1.work();
	}
public Parent3(int sal)
{
this.salary=sal;	
}

public void work() {
	System.out.println(this.salary);
	
	System.out.println("Agriculture");
}
}
