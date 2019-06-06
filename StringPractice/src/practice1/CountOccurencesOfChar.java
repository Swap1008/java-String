package practice1;

import java.util.Scanner;

public class CountOccurencesOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="students and working professionals and hello";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Charater to find repeat times");
		char ch=sc.next().charAt(0);
		
		char[] temp=str.toCharArray();
		int count=0;
		for (int i = 0; i < temp.length; i++) {
			if(temp[i]==ch) {
				count++;
			}
		}
		System.out.println("Char " + ch + "occurred " + count + "  times");
	}

}
