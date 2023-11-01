package lak1;
//simplify the program
public enum Acters {
	
	  VIJAY(50),AJITH(39),SIVA(45),SURYA(56),LAKSHMI; 
		private int salary;
		//int salary;
	   Acters(int i)
	   { 
		   this.salary=i; 
		   }
	   Acters() { 
		   this.salary=0;
		   } 
	   
	 
	public int getsalary() { 
		return this.salary; 
		}
	public void test() {
	  
	  
	  }
	 public static void main(String[] args) {
	  System.out.println("I am enum,not a class"); 
	  }
	 }
	 
	/*vijay
	{
		public void act() {
			System.out.println("acting");
		}
	},ajith,sk,vs,powerstar
	{
		public void act()//only for powerstar
		{
			System.out.println("offensive,very dangerous dance steps");
		}
	},vikram;
	public void act()
	{
	System.out.println("normal actors");	
	}
}*/
//bydefault  abstract  class Enum<E extends Enum<E>> present it only extends enum so no other class extend this one but defaultly calling happen

