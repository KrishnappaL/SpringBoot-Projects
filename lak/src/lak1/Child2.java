package lak1;
import p3.Parent;

public class Child2 extends Parent{

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Child2 ch1=new Child2();
				ch1.play();
				ch1.read();
				ch1.work();
				ch1.watchTV();
				ch1.work();
				System.out.println(ch1.salary);
			}

			public void read() {
				// TODO Auto-generated method stub
				System.out.println("reading");
				
			}

			public void play() {
				// TODO Auto-generated method stub
				System.out.println("playing");
			}

		}

	


