package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;

public class OrintDuplicates {
	public static void main(String[]args) {
		int arr[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(14);
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(15);		
		list.add(14);
        list.add(18);
		list.add(16);
		list.add(17);
		list.add(19);
		list.add(18);
		list.add(17);
		list.add(20);
		System.out.println("The Array elements are: "+list);
		HashSet<Integer> original = new HashSet<>();
		HashSet<Integer> duplicate = new HashSet<>();
		for(Integer integer : arr) {
			if(!original.add(integer)) {
				duplicate.add(integer);
			}
			}
		
		System.out.println("The Duplicates are: "+duplicate);



	}

}
