package lak1;

public  class AbstractCaller extends Parent1{
//because it act as abstract class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Parent1 pp=new Parent1();--->no object creation for abstract class so we use child class
	
	  AbstractCaller ab=new AbstractCaller();
	  ab.getLoan();
	 
		//child have rights to define abstract methods
		//ab.repay();
		
	}
	//method overriding
	
	 public void repay() {
	 System.out.println("I will pay on behalf of my parents"); }
	 
//child have rights to do not repay-->then you gave abstract for child
}
