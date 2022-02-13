package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[]rgs) {
		ArrayList<Integer> Array = new ArrayList<Integer>();
		Array.add(3);
		Array.add(2);
		Array.add(11);
		Array.add(4);
		Array.add(6);
		Array.add(7);
		System.out.println(Array);
		Collections.sort(Array);
		Collections.reverse(Array);
		System.out.println("Reverse Array: "+Array);
		System.out.println("The second Largest element is: "+Array.get(1));
		}

}
