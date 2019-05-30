package practice1;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String str="String class doesn’t have any method that directly sort a string";
		
		char[] temp=str.toLowerCase().toCharArray();
		
		Arrays.sort(temp);
		String str1="";
		for(int i=0;i<temp.length;i++) {
			str1=str1+temp[i];
		}
		
		System.out.println(str1.trim());
	}

}
