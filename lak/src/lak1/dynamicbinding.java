package lak1;

public class dynamicbinding extends Parent4{

	public static void main(String[] args) {
		dynamicbinding dy=new dynamicbinding();
		dy.study();
		dy.work();
		dy.play();
		//child object reference parent
	Parent4 parents=new dynamicbinding();//dynamic binding
	parents.work();
	parents.study();
//	parents.play();//show error because we can't call child methods-->restriction to parent can'i interfre child job
	}
	public void study() {
		System.out.println("studying");
	}
	public void play() {
		System.out.println("playing");
		
	}

}
