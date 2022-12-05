package Collection;

import java.util.LinkedHashSet;

public class Linked_Hashset {
	public class _LinkedHashSet {

		public static void main(String[] args) {
			
			LinkedHashSet hs = new LinkedHashSet();
			hs.add("Aditi");
			hs.add('B');
			hs.add(200);
			hs.add(50.45);
			hs.add(200);
			hs.add(null);
			hs.add(null);
			
			System.out.println(hs);//[Aditi, B, 200, 50.45, null]
			System.out.println(hs.size());//5
			
			System.out.println(hs.contains(null));//true
			System.out.println(hs.isEmpty());//false
			
			hs.remove(null);
			System.out.println(hs);//[Aditi, B, 200, 50.45]
			
			hs.clear();
			System.out.println(hs);//[]
		}}
	
		}


