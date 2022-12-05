package programm_logical;

public class fact1 {
public static void main(String[]args) {
	for(int j=1;j<=10;j++) {
		int n=j;
			int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(j+"!"+"="+fact);
	}
	
}
}
