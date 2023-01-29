import java.util.HashMap;

public class largest_subarray_with_zero_sum {

	public static void main(String[] args) {
		
		
//		int arr[] = {15,-2,2,-8,1,7,10,23};
		int arr[] = {-2,-12,2,11,12,-2,1,-2,2,-11,12,2,6};
		
			HashMap<Integer, Integer> map = new HashMap<>();
			
			//store (sum,index) pair
			int sum = 0;
			int len = 0;
			
			//loop
			for(int j = 0; j < arr.length; j++) {
				sum = sum + arr[j];
				//check if sum exist or not
				if(map.containsKey(sum)) {
					len = Math.max(len, j - map.get(sum));
				}else {
					//not exist
					map.put(sum, j);
				}
			}
			
			System.out.println(len);

	}

}
