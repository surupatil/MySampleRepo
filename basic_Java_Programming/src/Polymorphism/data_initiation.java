package Polymorphism;

public class data_initiation {

	public void addition()
	{
		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println("Addition:" + c);
	}


	public void addition(int a, int b) {
		System.out.println("Addition of two nos:" + (a + b));
	}

	public void addition(int a, int b, int c) {
		System.out.println("Addition of three nos:" + (a + b + c));
	}

	public void addition(float a, float b) {
		System.out.println("Addition of float nos:" + (a + b));
	}

}
