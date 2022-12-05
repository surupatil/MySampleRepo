package constructor;

public class Cunstructor_initiation {
	public static void main(String[] args) {

		//Cunstructor_initiation ex1 = new Cunstructor_initiation();
		//Cunstructor_initiation ex2 = new Cunstructor_initiation( 10);
		//Cunstructor_initiation ex3 = new Cunstructor_initiation(20,30));
		
		//Cunstructor_initiation ex4 = new Cunstructor_initiation("Vinit", 20);
		//Cunstructor_initiation ex5 = new Cunstructor_initiation("Qunatum",100,89.98f);
	}

	public  Cunstructor_initiation() {// access_specifier constructor_name
		System.out.println("Constructor with no arguments");

	}

	//Cunstructor_initiation {
		//System.out.println("Value of a:"+a);

	//}

	//Cunstructor_initiation {
		//int c = a + b;
		//System.out.println("Addition:"+c);

	//}

	Cunstructor_initiation(String name, int roll_no) {
		System.out.println("Name:"+name);
		System.out.println("Roll no:"+roll_no);

	}

	Cunstructor_initiation(String str, int no, float marks) {
		System.out.println("Value of str:"+str);
		System.out.println("Value of no:"+no);
		System.out.println("Marks:"+marks);

	}

}
