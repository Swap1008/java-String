package practice1;

public class CountWordsInString {

	public static void main(String[] args) {
		
		String str="students and working professionals and hello";
		
		String[] strArr=str.trim().split("\\s");
		System.out.println("No of words in String =  "+strArr.length);
	}

}
