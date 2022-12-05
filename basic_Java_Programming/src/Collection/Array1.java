package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();// create array list

		al.add("Aditi");
		al.add(22);
		al.add('A');
		al.add(85.25f);
		al.add(22);
		al.add('A');
		al.add(null);
		al.add(null);
		
		System.out.println("----Print info in Arraylist using Iterator cursor----");
		Iterator itr = al.iterator();
		while(itr.hasNext()){//[Aditi, 22, A, 85.25, 22, A, null, null]
			System.out.println(itr.next());
		}
		
		
		System.out.println("----Print info in Arraylist using List iterator cursor----");
		ListIterator litr = al.listIterator();
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		
		System.out.println("----Print info in Arraylist using for loop---");
		for(int i=0; i<=al.size()-1;i++){
			System.out.println(al.get(i));
		}
		
		
		System.out.println("----Print info in ArrayList using for each loop---");
		for (Object element : al) {
			System.out.println(element);
		}

	}

}
