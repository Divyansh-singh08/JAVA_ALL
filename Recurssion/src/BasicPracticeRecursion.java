import java.util.*;
public class BasicPracticeRecursion {

	public static int fact(int n) {
		if( n == 0 || n == 1) {
			return 1;
		}
		int smallOutput = fact(n-1);
		int output = n *smallOutput;
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
		

	}

}
