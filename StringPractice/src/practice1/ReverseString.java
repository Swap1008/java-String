package practice1;

public class ReverseString {

	public static void main(String[] args) {
		String str="students and working professionals and hello";
		str=str.trim();
		String rev="";
		for (int i = str.length()-1; i>=0 ; i--) {
//			if(str.charAt(i) !=' ') {
				rev=rev+ str.charAt(i);
//			}
		}
		System.out.println("Original String\n");
		System.out.println(str);
		System.out.println("\n Reverse String using simple String Class");
		System.out.println(rev);
		
		System.out.println("\n Using StringBuffer");
		StringBuffer sb=new StringBuffer("students and working professionals and hello");
		System.out.println(sb.reverse());
		
	}

}
