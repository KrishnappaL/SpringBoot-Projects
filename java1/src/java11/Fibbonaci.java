package java11;

public class Fibbonaci {

	public static void main(String[] args) {
		Fibbonaci fb = new Fibbonaci();
		//fb.find_sqr_root(25);
		//fb.fibbo();
		// fb.with_out_third_variable();
		//fb.find_leadt_common_multiple(4,10);
		//fb.sqr_root_numbers();
		//fb.infinity_loop();
	}

	private void infinity_loop() {
		while(true) {
			System.out.println("Hi Lakshmi be careful");
		}
	}

	private void sqr_root_numbers() {
		for(int i=2;i<=10;i++) {
			System.out.println("Square root of:"+i +"-->"+ i*i);
		}
	}

	private void find_leadt_common_multiple(int no1, int no2) {
		int div=2;
		int big=no1>no2?no1:no2;
		while(true) {
			if(big%no1==0 && big%no2==0) {
				System.out.println("lcm is"+big);
				break;
			}
			big=big+1;
		}
	}

	private void find_sqr_root(int num) {
		int div=2;
		while(div<num) {
			if(num/div==div) {
				System.out.println(div);
				break;
			}
			div++;
		}
	}

	private void with_out_third_variable() {
		int p1 = 0, p2 = 1;
		while (p1 <= 8) {
			System.out.println(p1 + " ");
			p2 = p1 + p2;
			p1 = p2 - p1;
		}
	}

	private void fibbo() {
		int p1 = 0, p2 = 1;
		Fibbonaci fb = new Fibbonaci();
		while (p1 < 80) {
			if (p1 > 1) {
				boolean result = fb.find_prime(p1);
				if (result == true)
					System.out.println("prime number " + p1);
			}
			int p3 = p1 + p2;
			p1 = p2;
			p2 = p3;
		}

	}

	private boolean find_prime(int p1) {
		if (p1 % 2 == 1) {
			return true;
		}
		return false;
	}

}
