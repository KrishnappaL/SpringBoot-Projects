package p4;

import java.io.FileNotFoundException;

public class explainthrowsandthrow {

	public static void main(String[] args) throws FileNotFoundException {	//extended other class
		// TODO Auto-generated method stub
		explainthrowsandthrow et=new explainthrowsandthrow();
		et.divide(100,2);
	}

	public void divide(int i, int j) throws FileNotFoundException{	//same class 
		System.out.println(i/j);
		int[] ar=new int[j];;
		
		
		
	}

}
