import java.util.Scanner;

public class SumUptotheNumberRecursion {

	//recursion
	public static void function(int i,int sum) {
		
		//base case
		if(i < 0) {
			System.out.println(sum);
			return;
		}
		//logic
		function(i-1,sum+i);
	}
	
	//another  way to write
	public static int function2(int n) {
		//base case
		if(n == 0) {
			return 0;
		}
		//logical case
		return n + function2(n-1);
	}
	
	//swap function
	public static void swap(int[]arr, int s, int e) {
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
	}
	
	//Reverse the Array via recursion
	public static void functionReverse(int s,int arr[],int n) {
		//base case
		if(s >= n/2) {
			return;
		}
		swap(arr,s,(n-s-1));
		functionReverse(s+1,arr,n);
		
	}
	
	//now we check is pallindrom or not
	public static boolean pallin(int i,String str) {
		//base case
		int n = str.length();
		if(i >= n/2) {
			return true;
		}
		//logical base case
		if(str.charAt(i) != str.charAt(n-i-1)) {
			return false;
		}
		
		pallin(i+1,str);
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number plz ");
		int n = s.nextInt();
		int sum = 0;
		function(n,sum); //recursion call  here
		int ans = function2(n);
		System.out.println("This is another way waiting "+ans);
		
		//take a array
		System.out.println("Enter the Array value ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		functionReverse(0,arr,n);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		String a = s.next();
		
		boolean right = pallin(0,a);
		System.out.println("This is the pallindrome String " + right);
	}

}
