import java.util.Scanner;

public class RecursionFibonaci {

	public static int fibofun(int n) {
		//base case
		if(n <= 1) {
			return n;
		}
		
		//logical case
		return fibofun(n-1) + fibofun(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = fibofun(n);
		System.out.println(ans);

	}

}
