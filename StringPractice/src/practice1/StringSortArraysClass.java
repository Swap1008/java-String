package practice1;

import java.util.Arrays;

public class StringSortArraysClass {

	public static void main(String[] args) {
		
		String str="students and working professionals";
		String[] str1=str.split("\\s");
		
		Arrays.sort(str1,new MyComparator());
		
		for (String str2 : str1) {
			System.out.print(str2+" ");
		}
		System.out.println(Arrays.binarySearch(str1, "and"));
	}

}
