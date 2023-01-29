
public class SndlargestElement {

	public static void main(String[] args) {
		   
		int arr[]= {8,9,9,1,7,5,5,10,1,0,7};
		int n = arr.length;
	        int l =Integer.MIN_VALUE;
	        int s =Integer.MIN_VALUE;
	        for(int i=0;i<n;i++){
	            if(arr[i] > l){
	                l=arr[i];
	                s=l;
	            }
	            if(arr[i] > s && arr[i] < l){
	                s=arr[i];
	            }
	        }
	       System.out.println(s);
	       System.out.println(l);
	}

}
