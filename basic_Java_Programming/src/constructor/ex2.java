package constructor;

public class ex2 {

	String name;//null
	int roll_no;//0
	float marks;//0.0
	boolean value; //false
	
	public static void main(String[] args) {
		 ex2 EX = new ex2();
		EX.m1();
	}
	
	public void m1(){
		System.out.println("running non static metho:m1");
	}
	

}
