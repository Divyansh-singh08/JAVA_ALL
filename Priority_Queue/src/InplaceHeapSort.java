
public class InplaceHeapSort {
	
	public static void downHeapify(int[]arr,int i,int n) {
		
		int parentIndex = i;
		int leftchildIndex = 2*parentIndex + 1;
		int rightchildIndex = 2*parentIndex + 2;
		
		//heap preocess
		while(leftchildIndex < n) {
			
			int minIndex = parentIndex;
			if(arr[minIndex] > arr[leftchildIndex]) {
				minIndex = leftchildIndex;
			}
			
			if(rightchildIndex < n && arr[minIndex] > arr[rightchildIndex]) {
				minIndex = rightchildIndex;
			}
			
			if(minIndex == parentIndex) {
				return;
			}
			
			//new to swap
			int temp = arr[parentIndex];
			arr[parentIndex] = arr[minIndex];
			arr[minIndex] = temp;
			
			//update the parentIndex & childIndex
			parentIndex = minIndex;
			leftchildIndex = 2*parentIndex + 1;
			rightchildIndex = 2*parentIndex + 2;
			
		}
	}
	
	public static void heapSort(int[] arr) {
		
		int  n = arr.length;
		//Build the HEAP
		for(int i = (n/2)-1;i>=0;i--) {
			//down Heapify Operation
			downHeapify(arr,i,n);
		}
		//once heap will done 
		//we need to remove element from starting one by one and put them at respective last position
		
		for(int i = n-1; i >= 0; i--) {
			//swap it
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			
			//after swaping downHeapify apply
			downHeapify(arr,0,i);
		}
		
	}

	public static void main(String[] args) {
		
		int[]arr = {4,7,3,2,8,9,6,1};
		heapSort(arr);
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
