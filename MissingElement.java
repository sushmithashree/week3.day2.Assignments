package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class MissingElement {
	public static void main(String[]args) {
		int arr[] = {1,2,3,4,7,6,8};
		ArrayList<Integer> Array = new ArrayList<Integer>();
		Array.add(1);
		Array.add(2);
		Array.add(3);
		Array.add(4);
		Array.add(7);
		Array.add(6);
		Array.add(8);
		Collections.sort(Array);
		System.out.println("The sorted Array is: "+Array);
		int j=1;
		for(int i=0; i<arr.length; i++) {
			if(j!=arr[i]) {
				System.out.println(j);
				break;
			}
			j++;
		}
		

		
	}

}
