package Generalization;

public class Airtel implements simCard {

	@Override
	public void audiocalling() {
		System.out.println("Airtel:audio calling: 500calls");
		
	}

	@Override
	public void Sms() {
		System.out.println("Airtel:sms:300");
		
	}

	@Override
	public void Internet() {
		System.out.println("Airtel:internet:4GB");
		
	}
	
	public void newFeatureB(){
		System.out.println("Airtel:newFetaure B");
	}

}
