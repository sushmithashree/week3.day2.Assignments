package week3.day2;

import java.util.LinkedHashSet;

public class FindIntersection {
	public static void main(String[]args) {
		LinkedHashSet<Integer> a = new LinkedHashSet<>();
		LinkedHashSet<Integer> b = new LinkedHashSet<>();
		a.add(3);
		a.add(2);
		a.add(11);
		a.add(4);
		a.add(6);
		a.add(7);
		System.out.println("The First array is: "+a);
		b.add(1);
		b.add(2);
		b.add(8);
		b.add(4);
		b.add(9);
		b.add(7);
		System.out.println("The Second array is: "+b);
		a.retainAll(b);
		System.out.println("Intersection: "+a);
	}

}
