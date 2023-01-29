import java.util.Scanner;

public class stairCase_1_2_3 {

	public static int stair(int n) {
		//make a dp index
		int dp[] = new int[n+1];
//		for(int i=0;i<n+1;i++) {
//			dp[i]=-1;
//		}
		dp[0] = 1;//base case
		dp[1] = 1;
		dp[2] = 2;
		
//		if(dp[n-1] != -1) {
//			return dp[n];
//		}
		for(int i=3;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
		}
		return dp[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = stair(n);
		System.out.println(ans);

	}

}
