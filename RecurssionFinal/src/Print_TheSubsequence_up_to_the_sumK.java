import java.util.ArrayList;

public class Print_TheSubsequence_up_to_the_sumK {

	//print the Subsequence_up_the K need
	public static void print_up_K(int ind,int[] arr,ArrayList<Integer> ans,int k,int sum) {
		//base case
		if(ind == arr.length) {
			if(k == sum) {
				System.out.println(ans);//print the list
				
			}
			return;
		}
		
		//logical case
		//take/pick
		ans.add(arr[ind]);//add
		sum += arr[ind];
		print_up_K(ind+1,arr,ans,k,sum);//pick it
		ans.remove(ans.size() - 1);//remove to not take part use
		//remove the value
		sum -= arr[ind];
		//not take/ not-pick
		print_up_K(ind+1,arr,ans,k,sum);
	}
	
						//print any one Subsequence
						//	logically

	public static boolean printAnyone(int ind,int[] arr,ArrayList<Integer> ans,int k,int sum) {
		//base case
		if(ind == arr.length) {
			//condition satisfied
			if(k == sum) {
				System.out.println(ans);//print the list
				return true;
			}
			else {
				return false;
			}
			
		}
				
		//logical case
		//take/pick
		ans.add(arr[ind]);//add
		sum += arr[ind];
		//pick it
		if(printAnyone(ind+1,arr,ans,k,sum) == true){
			return true;
		}
		ans.remove(ans.size() - 1);//remove to not take part use
		//remove the value
		sum -= arr[ind];
		//not take/ not-pick
		if(printAnyone(ind+1,arr,ans,k,sum) == true) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1};
		ArrayList<Integer> ds = new ArrayList<Integer>();
		int k = 0;
		print_up_K(0,arr,ds,k,0);
		printAnyone(0,arr,ds,k,0);

	}

}
