package practice1;

import java.util.Arrays;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		String str="Poor Daan is in a droop";
		str=str.toLowerCase();
		
		int vowelCount=0;
		int consonantCount=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=' ') {
				switch (str.charAt(i)) {
				case 'a':
					vowelCount++;
					break;
				case 'e':
					vowelCount++;
					break;
				case 'i':
					vowelCount++;
					break;
				case 'o':
					vowelCount++;
					break;
				case 'u':
					vowelCount++;
					break;
				default:
					consonantCount++;
					break;
				}
			}
			
		}
		
		System.out.println("Vowel Count =  " + vowelCount);
		System.out.println("Consonant Count =  " + consonantCount);
	}

}
