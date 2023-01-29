
public class BinarySearch {
	
	public static void swap(int[]arr,int first,int second) {
		int temp = arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}

	public static int getMinIndex(int[]arr, int start,int last) {
		
		int min = start;
		for(int i=start;i<last;i++) {
			if(arr[min]>arr[i]) {
				min=i;
			}
		}
		
		return min;
	}
	
	public static void selectionSort(int [] arr) {
		int n =arr.length; 
		for(int i=0;i<n;i++) {
			int first =i;
			int minIndex = getMinIndex(arr,i,n-1);
			swap(arr,minIndex,first);
			
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2,5,4,3,0,9,7};
		selectionSort(arr);
		

	}

}
