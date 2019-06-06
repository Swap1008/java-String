package practice1;

public class ConvertStringToInt {

	public static void main(String[] args) {
		String str="1000";
		int num=Integer.parseInt(str);
		System.out.println(num+1);
		
//		Number to String
		String newString=Integer.toString(num);
		System.out.println(newString );
	}

}
