package lak1;

public class aCTORSdEMO {
Singers a;
Acters ab;

//Inside class you create enum
enum Singers{
	SPB,KJY
}
	public aCTORSdEMO(Acters s) {
		// TODO Auto-generated constructor stub
		this.ab=s;
		System.out.println(s);
	}

	public aCTORSdEMO(Singers sb) {
		// TODO Auto-generated constructor stub
		this.a=sb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		aCTORSdEMO actor=new aCTORSdEMO(Acters.SIVA);
		actor.act();
		aCTORSdEMO ac =new aCTORSdEMO(Singers.SPB);
	}

	private void act() {
		// TODO Auto-generated method stub
		System.out.println("acting");
		
		 
		 
		
	}
/*
 * Acters a; public static void main(String[] args) { Acters[]
 * sc=Acters.values(); for(Acters ac: sc) System.out.println(ac +"-->" +
 * ac.ordinal()+" salary-" +ac.getsalary());//ac.salary when it is public
 * 
 * 
 * }
 */
/*
 * Acters a; public static void main(String[] args) { Acters.powerstar.act();
 * Acters.ajith.act(); Acters.vijay.act();
 * 
 * }
 */

}
