import java.util.Scanner;

public class Recursion {
	
	public static String[] subsequence(String input) {
		//base case
		if(input.length() == 0) {
//			return
			String[] output = new String[1];
			output[0] = "";
			return output;
		}
		
		String[] smallOutput = subsequence(input.substring(1));
		String[] output = new String[smallOutput.length*2];//double the size
		
		for(int i = 0; i < smallOutput.length; i++) {
			output[i] = smallOutput[i];
		}
		
		for(int i = 0; i< smallOutput.length; i++) {
			output[smallOutput.length + i] = input.charAt(0) + smallOutput[i];//copying the first part
		}
		
		return output;
		
	}

	public static void main(String[] args) {
		// TODO 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String ");
		String input = s.next();
		String[] output = subsequence(input);
		for(String outputStr : output) {
			System.out.println(outputStr);
		}
		
		

	}

}
