package contrroll_statment;

public class NESTED_IF {
	public static void main(String[] args) {

		String UN = "abcd";
		String PWD = "123";

		if (UN == "abcd") {
			System.out.println("Correct User Name");
			if (PWD == "123") {
				System.out.println("Correct Password");
				System.out.println("Login Successful");
			} else {
				System.out.println("Wrong Password");
				System.out.println("Login Failed");
			}
		} else {
			System.out.println("wrong username");
			System.out.println("Login Failed");
		}

	}
}
