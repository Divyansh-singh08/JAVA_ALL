import java.util.*;
public class inputArray {

	public static void printArray(int[] arr) {
		int n = arr.length;
		System.out.println("ALL value of array ");
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
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
	
	public static void incrementArr(int [] input) {
		input = new int [7];
		for(int i =0;i<input.length;i++) {
			input[i] = input[i]+1;
		}
	}
	
	public static void mul(int [] arr)
	{
	    for(int i=0;i<5;i++)
	    arr[i]*=i;

	}
	
	public static void change(int input[]){
	    input[0] = 15;
	    }
	
	public static void main(String[] args) {
//			int [] arr = takeArray();
////			System.out.println(arr);
//			incrementArr(arr);
//			printArray(arr);
////			System.out.println(arr);//address given
			
//			int arr[]={1,2,3,4,5};
//		    mul(arr);
//		    for(int i=0;i<5;i++)
//		    {
//		        System.out.print(arr[i]);
//		    }
		
		int arr[] = new int[5];
        change(arr);
        System.out.println(arr[0]);
			
			

	}

}
