package week3.day2;

import java.util.ArrayList;

public class RemoveDuplicates {
	public static void main(String[]args) {
		String text = " We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] arr = text.split(" ");
		ArrayList<String> original = new ArrayList<String>();
		ArrayList<String> duplicate = new ArrayList<String>();
		for(int i=0;i<arr.length;i++)
		{
			original.add(arr[i]);
			duplicate.add(arr[i]);
		}
		for(String string : duplicate)
		{
			if(string.equals("java")) {
				count++;
			}
			if(count>=1) {
				original.remove("java");
			}
		}
		System.out.println(original);
	}

}
