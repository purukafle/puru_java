package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(98);
		lhs.add("chandra");
		lhs.add(false);
		lhs.add('B');
		lhs.add(null);
		lhs.add(new Integer(34));
		lhs.add(98);
		System.out.println("LinkedList Elements are: "+lhs);
		
	}

}
