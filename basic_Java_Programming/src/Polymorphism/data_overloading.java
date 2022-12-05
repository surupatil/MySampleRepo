package Polymorphism;

public class data_overloading {

	public static void main(String[] args) {
		
		data_initiation DI = new data_initiation();
		DI.addition();
		DI.addition(50, 60);
		DI.addition(10, 20, 30);
		DI.addition(20.30f, 50.40f);
	}

}
