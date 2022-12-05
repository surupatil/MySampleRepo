package INHERITENCE;

public class Hirerchical_Inheritence {
public static void main(String[] args) {
		
		son1 s1 = new son1();
		s1.Home();
		s1.Money();
		s1.car();
		
		System.out.println();
		
		son2 s2 = new son2();
		s2.Home();
		s2.Money();
		s2.Mobile();
		
		System.out.println();
		
		son3 s3 = new son3();
		s3.Home();
		s3.Money();
		s3.Bike();
	}

}
