package lak1;

public class Desktop {

		public Desktop() {//implicit call
			System.out.println( "power on");//no constructor also no error because default constructor always present
		}
		public Desktop(String brand) {//it only call no argument constructor even if parameterized one present
			System.out.println("super "+ brand);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	}

}
//defaultly desktop only call