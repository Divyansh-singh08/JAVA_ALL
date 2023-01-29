import java.util.*;
public class HeapSort {
	    public static void main(String[] args) {
	       
	        PriorityQueue<Integer> pq = new PriorityQueue<>();
	       
//	        int[] arr = {4,3,7,6,9,10,1,2};
//	        int [] arr = {2,12,9,16,10,5,3,20,25,11,1,8,6};
	        int [] arr = {87,79,67,15,68,68,58,89,85,30};
//	        int [] arr = {2,6,10,11,13,4,1,20};
	       
	        for(int i = 0; i < arr.length; i++){
	            pq.add(arr[i]);
	        }
	        System.out.print(pq);
	        
	        System.out.println("\n");
	        
	       
	        while(!pq.isEmpty()){
	            System.out.print(pq.peek()+" ");
	            pq.poll();
	        }
	    }
	}

