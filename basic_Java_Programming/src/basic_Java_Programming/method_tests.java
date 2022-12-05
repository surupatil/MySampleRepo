package basic_Java_Programming;

public class method_tests {

	public static void main(String[] args) {
		//non-static members(variables or methods_-----object of class
		method_tests t = new method_tests();// object creation
		t.m1();// object_name.method_name
		t.m2();
	}
	
	
	public void m1(){// non-static method
		System.out.println("running non-static method from same class:m1");
	}
	
	public void m2(){
		System.out.println("running non-static method from same class:m2");
	}

}
