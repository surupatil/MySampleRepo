package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Array_vector {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add("Sushant");
		v.add('A');
		v.add(54.62);
		v.add(100);
		v.add(null);
		v.add("november");
		
		System.out.println(v);//[Sushant, A, 54.62, 100, null, november]	
		System.out.println(v.capacity());//10
		
		System.out.println(v.isEmpty());//false
		System.out.println(v.size());//6
		System.out.println(v.contains(100));//true
		
		System.out.println(v.set(4, "Quantum"));
		System.out.println(v.get(4));//Quantum
		
		v.remove(5);
		System.out.println(v);//[Sushant, A, 54.62, 100, Quantum]
		
		System.out.println("----Print vector info using Iterator cursor----");
		Iterator itr = v.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		System.out.println("----Print vector info using ListIterator cursor----");
		ListIterator litr = v.listIterator();
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		
		System.out.println();

		System.out.println("----Print vector info using Enumerator cursor----");
		Enumeration en = v.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
		System.out.println();

		System.out.println("----Print vector info using forEach cursor----");
		for (Object v1 : v) {
			System.out.println(v1);
		}

	}
	}


