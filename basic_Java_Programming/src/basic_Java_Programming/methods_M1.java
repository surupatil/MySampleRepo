package basic_Java_Programming;

public class methods_M1 {
	
	public static void main(String[] args) {
		// 1. Calling static method from same class
		//static members---class
		m1();//calling m1 method
		m2();
		M1();
		M2();
	}
	public static void M1() {
		System.out.println("Running static method M1");
		
	}
	public static void M2()
	{
		System.out.println("Running static method M2");
	}
	
	/*public void m1(){//access_specifier return_type method_name
		
	}*/
	
	public static void m1(){
		System.out.println("running static method:m1");
	}
	
	public static void m2(){
		System.out.println("running static method:m2");
	}
		


}
