package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
		
		TreeSet tr = new TreeSet();
		tr.add(85);
		tr.add(12);
		tr.add(100);
		tr.add(20);
		tr.add(10);
		tr.add(500);
		//tr.add(null);//NullPointerException
		tr.add(500);
		
		System.out.println(tr);//[10, 12, 20, 85, 100, 500]
		System.out.println(tr.size());//6
		
		System.out.println(tr.isEmpty());//false
		System.out.println(tr.contains(50));//false
		
		System.out.println(tr.first());//10----returns 1st element in treeset
		System.out.println(tr.last());//500----returns last element in treeset
		
		tr.pollFirst();//delete 1st element in treeset
		System.out.println(tr);//[12, 20, 85, 100, 500]
		
		tr.pollLast();//delete last element in treeset
		System.out.println(tr);//[12, 20, 85, 100]
		
		System.out.println("----Print info in TreeSet using Iterator----");
		Iterator itr = tr.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("----Print info in TreeSet in descending order using Iterator----");
		Iterator ditr = tr.descendingIterator();
		while(ditr.hasNext()){
			System.out.println(ditr.next());
		}
		
		System.out.println("----Print info in TreeSet using forEach loop----");
		for (Object tr1 : tr) {
			System.out.println(tr1);
		}

	}

}
