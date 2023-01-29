import java.util.Scanner;

public class largest_sum_of_column {

	public static int[][] takeInput(){
		Scanner src = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows = src.nextInt();
		System.out.println("enter the number of colums");
		int cols = src.nextInt();
		
		int[][]arr=new int[rows][cols];
		
		//this is for taking the input the value into the 2D array
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter the element at "+ i + " rows " + j +" column ");
				arr[i][j] = src.nextInt();
			}
		}
		return arr;
	}
	
	public static int largeColums(int[][] arr){
		int row = arr.length;
		int col = arr[0].length;
		int max=Integer.MIN_VALUE;
		for(int j=0;j<col;j++) {
			int sum=0;
			for(int i=0;i<row;i++) {
				sum+=arr[i][j];
			}
			if(sum>max) {
				max=sum;
			}
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr = takeInput();
		int largeCol = largeColums(arr);
		System.out.println("largest col od sum is "+largeCol);
		
		int arr1[][]={ {1,2,3,4} , {2,4} , {3,5,7,8,9,11} };
	    System.out.print(arr1.length+arr1[0].length+
	    arr1[1].length+arr1[2].length);

	}

}
