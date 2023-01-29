import java.util.ArrayList;

public class remove_consecutiveDuplicate {

	public static ArrayList<Integer> removeConsecutive(int arr[]){
		
		ArrayList<Integer> result = new ArrayList<>();
		result.add(arr[0]);//we add the zero t'h element to the first arrayList
		for(int i = 1;i<arr.length;i++) {
			if(arr[i] != arr[i-1]) {
				result.add(arr[i]);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int arr[] = {10,10,20,20,20,30,40,10};
		
		ArrayList<Integer> ans = removeConsecutive(arr);
		//normal for loop to print
		for(int i=0;i<ans.size();i++) {
			System.out.println(" Normal for loop "+ans.get(i));
		}
		
		//Enhance for Each loop
		for(int i: ans) {
			System.out.println(" Enhance for loop "+i);
		}
		
		

	}

}
