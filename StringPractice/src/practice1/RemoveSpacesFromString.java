package practice1;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
		String str="students and working professionals and hello";
		
		System.out.println("Original String");
		System.out.println(str);
		
		str=str.replaceAll("\\s", "");
		
		System.out.println("Changed String\n");
		System.out.println(str);
		
		
		
	}

}
