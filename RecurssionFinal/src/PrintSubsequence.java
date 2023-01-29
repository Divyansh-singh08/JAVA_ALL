import java.util.Scanner;

public class PrintSubsequence {
	
//	public static String[] subsequences(String input) {
//		
//	}
	
	public static void printSubsequences(String input,String stringMain) {
		//base case
		if(input.length() == 0) {
			System.out.println(stringMain);
			return;
		}
		
		//recursive call
		String smallInput = input.substring(1);
		printSubsequences(smallInput,stringMain);
		printSubsequences(smallInput,stringMain + input.charAt(0));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String input = s.next();
//		String[] output = subsequences(input);
		printSubsequences(input,"");
//		for(String outputString : output) {
//			System.out.println(outputString);
//		}

	}

}
