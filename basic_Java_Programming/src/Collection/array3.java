package Collection;

public class array3 {
public static void main(String[] args) {
		
		int ar[] = new int[5];//array declaration
		ar[0] = 100;//array initialization
		ar[1] = 20;
		ar[2] = 60;
		ar[3] = 30;
		ar[4] = 70;
		
		//ar.length----returns no. of elements in array
		
		for(int i = 0; i<=ar.length-1; i++){
			System.out.println(ar[i]);
		}
	}


}
