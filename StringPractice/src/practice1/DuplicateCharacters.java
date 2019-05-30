package practice1;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// Duplicate Characters
		String str="students and working professionals";
		char str1[]=str.toCharArray();
		for (int i = 0; i < str1.length; i++) {
			int count=1;
			for (int j = i+1; j < str1.length; j++) {
				if(str1[i]==str1[j] && str1[i]!=' ') {
					count++;
					str1[j]='0';
				}
			}
			if(count>1 && str1[i]!='0') {
				System.out.print(str1[i]+"  ");
			}
			
		}

	}

}
