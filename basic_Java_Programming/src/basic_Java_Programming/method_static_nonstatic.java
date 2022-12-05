package basic_Java_Programming;

public class method_static_nonstatic {

	public static void main(String[] args) {
		mult();
		method_static_nonstatic d1 = new method_static_nonstatic();// object creation
		d1.add();// objectname.methodname;
	}

	// parameters----variables or arguments
	public void m1() {// method without parameter/with zero parameter

	}

	public static void mult() {// static method without parameter
		int a = 80;
		int b = 50;
		int c = a * b;

		System.out.println("Multiplication of two nos:" + c);
	}

	public void add() {// non-static method without parameter
		int a = 15;
		int b = 17;

		int sum = a + b;

		System.out.println("Addition of two nos:" + sum);
	}

}
