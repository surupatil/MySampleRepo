package contrroll_statment;

public class SWITCH {

	public static void main(String[] args) {
		
		String option = "xyz";
		
		switch(option){
		case "MT":
			System.out.println("----Money Transfer----");
			break;
			
		case "BI":
			System.out.println("----Balance Inquiry----");
			break;
			
		case "CW":
			System.out.println("----Cash Withdrawl----");
			break;
			
		case "CP":
			System.out.println("----Change Pin----");
			break;
			
		case "MS":
			System.out.println("----Mini Statement----");
			break;
			
		default:
			System.out.println("----wrong input----");
			break;
		}
	}

}
