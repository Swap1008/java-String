package practice1;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String str="Poor Dan is in a droop";
		str=str.toLowerCase();
		char[] chArr=str.toCharArray();
		
		TreeSet ts=new TreeSet();
		
		for (Object object : chArr) {
			ts.add(object);
		}
		
		System.out.println(ts);
		String newStr="";
		for (Object object : ts) {
			newStr=newStr+object;
		}
		System.out.println(newStr.trim());
	}

}
