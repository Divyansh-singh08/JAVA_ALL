
public class Binary_Search {

	public static int binarySearch(int a[],int si,int ei,int x) {
		//base case
		if(si>ei) {
			return -1;
		}
		
		//logical part here ....
		
		int midIn = (si+ei)/2;
		if(a[midIn] == x) {
			return midIn;
		}else if(a[midIn] < x) {
			return binarySearch(a,midIn+1,ei,x);
		}else {
			return binarySearch(a,si,midIn-1,x);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,5,9,14,12,0,15,4,3};
		System.out.println(binarySearch(a,0,a.length-1,12));
		
	}

}
