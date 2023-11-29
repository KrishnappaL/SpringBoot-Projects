package logical;

public class University {

	public static void main(String[] args) {
		College principal=new College();
		College.Dept hod=principal.new Dept();
		hod.conductFunction();
	}

}
