package p3;

import java.io.File;
//mport java.io.IOException;

public class Filecreate {

	public static void main(String[] args) {
		//File ff=new File("//home//lakshmi//Desktop//july1//july2//july3//raja.txt");//subfolder
		//File ff=new File("//home//lakshmi//Desktop//july1);//folder create

		//System.out.println(ff.mkdir());//one directory create
	//	System.out.println(ff.exists());
	/*
	 * if(!ff.exists()) { ff.mkdirs();//subfolder created }
	 * 
	 * try { if(!ff.exists()) ff.createNewFile(); } catch (IOException e) { // TODO
	 *  System.out.println("not present");
	 * e.printStackTrace(); }
	 */
	/*
	 * if(ff.exists()) ff.delete();
	 */
	/*
	 * System.out.println(ff.canRead()); System.out.println(ff.canWrite());
	 */
		File f=new File("//home//lakshmi//Documents");
		/*
		 * String[] ss=f.list(); for(int i=0;i<ss.length;i++) { if(ss[i].charAt(0)=='W')
		 * System.out.println(ss[i]);
		 * 
		 * }
		 */
		File[] ff=f.listFiles();
		/*
		 * for(int i=0;i<ff.length;i++) { //if(ff[i].isDirectory()) if(ff[i].isFile())
		 * System.out.println(ff[i]); }
		 */
		for(int i=0;i<ff.length;i++) {
		if(ff[i].isFile())
		{
			String name=ff[i].getName();
				//if(name.charAt(0) = 'W')
					System.out.println(name);
		}
	}

}
}