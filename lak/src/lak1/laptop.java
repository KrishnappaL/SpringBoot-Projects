package lak1;
public class laptop extends Desktop{
public laptop() {//noarguments constructor
	this("raf");
		System.out.println("charging");
	}
public laptop(String brand) {
		// TODO Auto-generated constructor stub
		//super always first statement 
		super(brand);//explicit call costructor and use comma you gave any number of parameters
		//explicit and implicit  call constructor
		System.out.println(brand);
	
	}
public static void main(String[] args) {
	laptop lp=new laptop();//no argument
	laptop lp2=new laptop("dell");//it also calls no argument constructor
		lp2.work();
	}
private void work() {
		System.out.println("goo performance");
	}

}
//this() and super() can't use in main() because it is static block
