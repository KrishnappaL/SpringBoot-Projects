package logical;

public class College {

	public static void main(String[] args) {
		College principal=new College();
		principal.meetingHODs();
		//College.Dept hod=principal.new Dept();
		//hod.conductFunction();
	}
	private void meetingHODs() {
		Dept hod=new Dept();
		hod.conductFunction();
	}
	class Dept{
		public void conductFunction() {
			System.out.println("ECE Dept. Function");
		}
	}

}
