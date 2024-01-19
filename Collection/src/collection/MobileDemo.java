package collection;

import java.util.ArrayList;

public class MobileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobiles m1=new Mobiles("Sony",15000);
		Mobiles m2=new Mobiles("Samsung",18000);
		Mobiles m3=new Mobiles("Apple",12000);
		Mobiles m4=new Mobiles("Vivo",25000);
ArrayList mobileList=new ArrayList();
mobileList.add(m1);
mobileList.add(m2);
mobileList.add(m3);
mobileList.add(m4);
//System.out.println(mobileList);
//hashcode-->hexadecimal value of hashcode
for(Object ob:mobileList) {
	Mobiles mobile=(Mobiles)ob; //convert Object class object to child class  object.Child class id Mobiles==>Is called Down casting
	if(mobile.price>15000)
		System.out.println(ob);
}
		
	}

}
