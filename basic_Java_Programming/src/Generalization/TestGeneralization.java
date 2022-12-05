package Generalization;

public class TestGeneralization {
public static void main(String[] args) {
		
		System.out.println("----features of Gio simcard----");
		Gio g = new Gio();
		g.audiocalling();
		g.Sms();
		g.Internet();
		g.newFeatureA();
		
		System.out.println();
		
		System.out.println("----features of airtel simcard----");
		Airtel a = new Airtel();
		a.audiocalling();
		a.Sms();
		a.Internet();
		a.newFeatureB();
		
		System.out.println();
		System.out.println("----features of Vodafone simcard----");
		Vodafone v = new Vodafone();
		v.audiocalling();
		v.Sms();
		v.Internet();
		v.newFeatureC();
	}

}
