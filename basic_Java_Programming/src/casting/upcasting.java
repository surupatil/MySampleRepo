package casting;

public class upcasting {

	public static void main(String[] args) {
		
		son s = new son();
		s.Mobile();
		s.Money();//150
		
		
		father s1 = new son();//upcasting
		s1.Money();//150
		
		son s2 = (son)s1; //downcasting
		s2.Mobile();
		s2.Money();
	}

}
