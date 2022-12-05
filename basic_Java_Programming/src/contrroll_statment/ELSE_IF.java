package contrroll_statment;

public class ELSE_IF {
public static void main(String[] args) {
		
		int marks = 60;
		
		if(marks >= 65){
			System.out.println("Distinction");
		}
		else if(marks >=60){//60 >= 60
			System.out.println("First class");
		}
		else if(marks >= 50){// 52 >= 50
			System.out.println("Second class");
		}
		else if(marks >= 35){
			System.out.println("Pass");
		}
		else{
			System.out.println("fail");
		}
		
	}

}
