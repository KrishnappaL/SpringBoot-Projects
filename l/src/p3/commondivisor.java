package p3;

public class commondivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		commondivisor cm=new commondivisor();
		cm.find_commondivisor(100,1000);
	}	
	private void find_commondivisor(int no1, int no2) {
		// TODO Auto-generated method stub
		int small=no1<no2?no1:no2;
		int greatest=-1;
		int div = 2;
		while(div<=small)	
		//while(div<=no1&& div<=no2)
		{
		if(no1%div==0&&no2%div==0)
			//System.out.println(div);
			greatest=div;
		div=div+1;
	}
		if(greatest<0)
			System.out.println(greatest);
		else System.out.println(greatest + " is greatest one");
	}

}
