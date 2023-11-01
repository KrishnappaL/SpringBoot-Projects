package p4;

public class Softwareengineer extends Parent4 implements Officerules,Trafficrules{			//support multiple inheritance--indirectly support
	/*
	 * public static void main(String[] args) { Softwareengineer se=new
	 * Softwareengineer(); se.apply_leave(); se.chatt();
	 * 
	 * System.out.println(se.leave);
	 * System.out.println(Softwareengineer.salary);//using class name
	 * System.out.println(Officerules.leave); //se.leave=25; }
	 */
	public static void main(String[] args) {
		Trafficrules police=new Softwareengineer();			// It can only access traffic rules
		police.go_slow();
		police.keep_left();
		Officerules manager=new Softwareengineer();		//It can access only Officerules
		manager.apply_leave();
		manager.get_salary();
		Parent4 parent=	new Softwareengineer();
		parent.study();
		parent.work();

	}
	public void work() {
		System.out.println("working from child");
	}
public Softwareengineer()
{
	
}
	public void apply_leave() {
		System.out.println("apply leave");

	}
	public void worl_8_hours() {
		System.out.println("Daily ");

	}
	public void wear_formals() {
		System.out.println("wear formals");

	}
	public void get_salary() {
		
		System.out.println("salary every month");

}
	public void takebreak()
	{
		System.out.println("Leisure time");
	}
public void chatt() {
	System.out.println("chatting");
}
public void go_slow() {
	
}
public void keep_left() {
	
}
public void study() {
	
}

}