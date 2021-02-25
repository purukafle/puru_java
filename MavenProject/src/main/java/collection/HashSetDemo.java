package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(new Integer(10));
		hs.add("chandra");
		hs.add('B');
		hs.add(null);
		hs.add(true);
		hs.add(87);
		hs.add(10);
		System.out.println("HashSet Elements are : " + hs);
		System.out.println(hs.contains("chandra"));
		System.out.println("hashSet size: " + hs.size());
		hs.remove("chandra");
		System.out.println("After removing Elements are : " + hs);
		HashSet hs1 = new HashSet();
		hs.add(100);
		hs.add(200);
		hs.addAll(hs1);
		System.out.println(hs);
		System.out.println(hs.containsAll(hs1));
		hs1.clear();
		System.out.println("second hasset After clear Elements: " + hs1);
		System.out.println(hs1.isEmpty());
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
