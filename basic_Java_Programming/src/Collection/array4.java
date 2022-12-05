package Collection;
import java.util.Arrays;
public class array4 {

	public static void main(String[] args) {
		
		int ar[] = {100,10,20,50,80,60,40,15,85};
		
		System.out.println("----Original info----");
		for(int i=0;i<=ar.length-1;i++){
			System.out.println(ar[i]);
		}
		
		System.out.println();
		
		Arrays.sort(ar);//ascending order
		System.out.println("----Ascending order----");
		for(int i = 0; i<=ar.length-1; i++){
			System.out.println(ar[i]);
		}
		
		System.out.println();
		
		System.out.println("----Descending order---");
		for(int i = ar.length-1; i>=0; i--){
			System.out.println(ar[i]);
		}
	}


}
