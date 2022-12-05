package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Array_Hashset {
public static void main(String[] args) {
		

		ArrayList al = new ArrayList();// create array list

		al.add("Aditi");
		al.add(22);
		al.add('A');
		al.add(85.25f);
		al.add(22);
		al.add('A');
		al.add("Aditi");
		al.add(22);
		
		System.out.println(al);//[Aditi, 22, A, 85.25, 22, A, Aditi, 22]
		
		HashSet hs = new HashSet(al);
		System.out.println(hs);//[A, 22, Aditi, 85.25]
	}

}
