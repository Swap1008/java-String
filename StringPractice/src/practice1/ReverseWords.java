package practice1;

public class ReverseWords {

	public static void main(String[] args) {
		String str="students and working professionals";
		String[] strArr=str.split(" ");
		String reverseString="";
		
		for (int i = 0; i < strArr.length; i++) {
			String word=strArr[i];
			String reverseWord="";
			for (int j = word.length()-1; j>= 0; j--) {
				reverseWord=reverseWord + word.charAt(j);
			}
			reverseString=reverseString +" " +reverseWord;
		}
		
		System.out.println(reverseString);

	}

}
