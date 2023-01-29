import java.util.*;
public class print_all_char_in_String_passed {

	public static void printChar(String str) {
		//here loop for iteration the String
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printChar(str);
		

	}

}
