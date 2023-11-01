package lak1;
//constants and predefined set of values
public class EnumerationExplain {
	Day day;
	public EnumerationExplain(Day da)
	{
		this.day=da;
	}
	public void tell() {
		switch(day) {
		case MONDAY:System.out.println("mondays are bad"); break;
		case FRIDAY:System.out.println("fridays are better"); break;
		case SATURDAY:	case SUNDAY:System.out.println("wekenda are best"); break;
		}
	}

	public static void main(String[] args) {
		EnumerationExplain first=new EnumerationExplain(Day.MONDAY);
		first.tell();
		EnumerationExplain sec=new EnumerationExplain(Day.SUNDAY);
		sec.tell();
	}

}
