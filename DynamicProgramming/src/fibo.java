import java.util.Scanner;

public class fibo {

	public static int fib(int n,int[]dp) {
		//bas case
		if(n == 0 || n == 1) {
			return n;
		}
		int ans,ans1;
		
		//condition
		if(dp[n-1] == -1) {
			ans = fib(n-1,dp);
			dp[n-1] = ans;
		}else {
			ans = dp[n-1];
		}
		
		if(dp[n-2] == -1) {
			ans1 = fib(n-2,dp);
			dp[n-2] = ans1;
		}else {
			ans1 = dp[n-2];
		}
		
		
		
		int myans = ans + ans1;
		
		return myans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		//take the input
		int n = s.nextInt();
		int dp[] = new int[n+1];
		for(int i =0;i<n+1;i++) {
			dp[i] = -1;
		}
		int newans = fib(n,dp);
		System.out.println(newans);

	}

}
