package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
	
	public static boolean checkAnagram(String str1,String str2) {
		str1=str1.replace("\\s", "").toLowerCase();
		str2=str2.replace("\\s", "").toLowerCase();
		char[] str3=str1.toCharArray();
		char[] str4=str2.toCharArray();
		Arrays.sort(str3);
		Arrays.sort(str4);
		
		if(Arrays.equals(str3, str4)) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String str1=sc.nextLine();
		System.out.println("Enter Second String");
		String str2=sc.nextLine();
		
		boolean res=checkAnagram(str1, str2);
		if(res) {
			System.out.println("Strings are Anagram");
		}else {
			System.out.println("Not Anagram");
		}

	}

}
