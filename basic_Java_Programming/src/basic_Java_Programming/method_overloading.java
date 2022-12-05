package basic_Java_Programming;

public class method_overloading {

	public static void main(String[] args) {
		
		mult(10,20);
		
		method_overloading d2 = new method_overloading();
		d2.add(10, 20, 30);
	}
	
	public static void mult(int a, int b){//static method with parameter
		int c = a * b; //10 * 20
		System.out.println("Multiplication of two nos:"+c);
		
	}
	
	public void add(int a, int b, int c){//non-static method with parameter
		int d = a + b + c;
		System.out.println("Addition of three nos:"+d);
		
	}

}
