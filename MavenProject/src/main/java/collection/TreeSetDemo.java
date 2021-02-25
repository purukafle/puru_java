package collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(80);
		ts.add(8);
		ts.add(-12);
		ts.add(23);
		ts.add(15);
		System.out.println("TreeSet Elements are : "+ts);
		System.out.println("After duplicating the tree set elements-------");
		try {
			ts.add(80);
			ts.add(null);
			ts.add("abc");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("TreeSet Elements can't be duplicate and immutable");
	}

}
