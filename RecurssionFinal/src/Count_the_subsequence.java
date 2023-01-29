
public class Count_the_subsequence {

	public static int countSub(int ind,int[] arr,int sum,int size,int k) {
		//base case
		if(ind == size) {
			//condition satisfied
			if(k == sum) {
				return 1;
			}else {
				return 0;
			}
		}
		
		//logical case
		k = k+arr[ind];
		//pick
		int l = countSub(ind+1,arr,sum,size,k);
		//remove
		k = k - arr[ind];
		//not-pick
		int r = countSub(ind+1,arr,sum,size,k);
		
		return l+r;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,1};
		int n = arr.length;
		int sum = 2;
		System.out.println(countSub(0,arr,sum,n,0));

	}

}
