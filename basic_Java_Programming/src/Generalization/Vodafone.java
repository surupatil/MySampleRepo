package Generalization;

public class Vodafone implements simCard {

	@Override
	public void audiocalling() {
		System.out.println("Vodafone:audo calling: 400calls");
		
	}

	@Override
	public void Sms() {
		System.out.println("Vodafone:sms:300sms");
		
	}

	@Override
	public void Internet() {
		System.out.println("Vodafone:internet:2GB");
		
	}
	
	public void newFeatureC(){
		System.out.println("Vodafone:new feature C");
	}

}
