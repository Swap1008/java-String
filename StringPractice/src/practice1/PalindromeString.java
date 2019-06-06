package practice1;

public class PalindromeString {

	public static void main(String[] args) {
		String str="nitin";
		str=str.trim();
		String rev="";
		for (int i = str.length()-1; i >=0; i--) {
			rev=rev+str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
