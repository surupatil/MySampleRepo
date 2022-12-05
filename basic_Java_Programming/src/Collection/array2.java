package Collection;

public class array2 {

	public static void main(String[] args) {
		
		String arr[] = new String[5];
		arr[0] = "Sumit";
		arr[1] = "Supriya";
		arr[2] = "Aditi";
		arr[3] = "Diksha";
		arr[4] = "Yogesh";
		
		int size = arr.length;//5
		
		System.out.println("----Print all information in array----");
		for(int i=0; i<=size-1; i++){
			System.out.println(arr[i]);//[Sumit, Supriya, Aditi, Diksha, Yogesh]
		}
	
	}

}
