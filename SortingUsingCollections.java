package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollections {
	public static void main(String[]args) {
		String[] input = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		String[] name = new String[4];
		List<String> list = new ArrayList<String>();
		list.add("HCL");
		list.add("Wipro");
		list.add("Aspire Systems");
		list.add("CTS");
		System.out.println(list);
		System.out.println(list.size());
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	
	}

}
