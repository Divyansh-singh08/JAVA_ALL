import java.util.*;
public class Largest_value_array {

	//finding the largest element in the array
	public static int largestElement(int [] arr) {
		int n = arr.length;
		int max =Integer.MIN_VALUE;
		for(int i = 0; i<n; i++) {
			if(max>arr[i]) {
				max = max;
			}else {
				max = arr[i];
			}
		}
		return max;
		
	}
	
	//this is the function for taking array
		public static int [] takeArray() {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			//create the new array of size n 
			int [ ] arr= new int [n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = s.nextInt() ;
			}
			return arr;
	}
	
	public static void main(String[] args) {
			int [] arr = takeArray();
			int lar  = largestElement(arr);
			System.out.println("largest element in the array is "+lar );
		}

}
