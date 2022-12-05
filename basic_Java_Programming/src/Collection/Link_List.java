package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Link_List {
public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add("Sushant");
		ll.add(200);
		ll.add(75.95);
		ll.add('A');
		ll.add(null);
		ll.add(200);
		ll.add(null);
		
		System.out.println(ll);//[Sushant, 200, 75.95, A, null, 200, null]
		System.out.println(ll.isEmpty());//false
		System.out.println(ll.size());//7
		
		ll.add(2, "Quantum");
		System.out.println(ll.get(2));//Quantum
		System.out.println(ll.get(3));//75.95
		
		ll.set(5, 'B');
		System.out.println(ll);//[Sushant, 200, Quantum, 75.95, A, B, 200, null]
		
		System.out.println(ll.contains(600));//false
		
		System.out.println("---Print LinkedList info using Iterator cursor---");
		Iterator itr = ll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println("---Print LinkedList info using ListIterator cursor---");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext()){
			System.out.println(litr.next());
		}

		System.out.println();
		System.out.println("---Print LinkedList info using forEach Loop---");
		for (Object l1 : ll) {
			System.out.println(l1);
		}


	}

}
