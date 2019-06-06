package practice1;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		String str="Big black bug bit a big black dog on his big black nose";
		String strArr[]=str.split("\\s");
		String[] duplicateStr=new String[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			for (int j = i+1; j < strArr.length; j++) {
				if(strArr[i].equalsIgnoreCase(strArr[j])) {
					duplicateStr[i]=strArr[i];
				}
			}
		}
	}

}
