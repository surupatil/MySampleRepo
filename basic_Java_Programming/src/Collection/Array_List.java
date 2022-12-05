package Collection;
import java.util.ArrayList;
public class Array_List {


	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();//create array list
		
		al.add("Aditi");
		al.add(22);
		al.add('A');
		al.add(85.25f);
		al.add(22);
		al.add('A');
		al.add(null);
		al.add(null);
		
		System.out.println(al);//[Aditi, 22, A, 85.25, 22, A, null, null]
		
		System.out.println(al.size());//8
		
		System.out.println(al.isEmpty());//false
		
		System.out.println(al.contains(100));//false
		
		System.out.println(al.get(2));//A
		
		System.out.println(al.get(7));//null
		
		//insert infor in betn arraylist-----right shift operation
		al.add(2, "Pune");
		System.out.println(al);//[Aditi, 22, Pune, A, 85.25, 22, A, null, null]-----right shift operation
		System.out.println(al.get(2));//Pune
		System.out.println(al.get(3));//A
		
		//moify/replace
		al.set(7, 100);
		System.out.println(al);//[Aditi, 22, Pune, A, 85.25, 22, A, 100, null]
		
		//remove info in betn arraylist----left shift operation
		al.remove(5);
		System.out.println(al);//[Aditi, 22, Pune, A, 85.25, A, 100, null]
		System.out.println(al.get(5));//A
		System.out.println(al.get(6));//100

	}

}
