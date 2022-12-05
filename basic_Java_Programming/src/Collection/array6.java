package Collection;

public class array6 {

	public static void main(String[] args) {
		
		int ar[][] = new int[2][2];//declaration
		ar[0][0] = 10;//initialization
		ar[0][1] = 20;
		ar[1][0] = 30;
		ar[1][1] = 40;
		
		for(int i=0; i<=1; i++){//row
			for(int j=0; j<=1; j++){//column
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}


}
