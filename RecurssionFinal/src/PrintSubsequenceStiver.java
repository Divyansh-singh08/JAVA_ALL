import java.util.ArrayList;

public class PrintSubsequenceStiver {

	//print the subsequence
	public static void subseq(int index,int[]arr,ArrayList<Integer> ans) {
		//base case
		if( index == arr.length) {
			if(ans.size() >= 0) {
				System.out.println(ans);
			}
			return;
		}
		
//		logical case
//		ans.add(arr[index]);// add the value for take to it
//		subseq(index+1,arr,ans);//recursive call for take....
//		ans.remove(ans.size() - 1); //remove the value for non-take value
//		subseq(index+1,arr,ans);//recursive call for non-take...
		
		
		
		subseq(index+1,arr,ans); //recursive call for non-take....
		
		ans.add(arr[index]); // add the value for take to it
		
		subseq(index+1,arr,ans); //recursive call for non-take...
		
		ans.remove(ans.size() - 1); //remove the value for take value
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		ArrayList<Integer> ar = new ArrayList<>();
		subseq(0,arr,ar);

	}

}
