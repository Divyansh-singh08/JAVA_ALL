import java.util.*;
public class array_2d_pro {

	public static void main(String[] args) {
		 
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
		
		//now need to print the 2D array now 
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
//				System.out.println("This is the " + i +" rows " + j + " columns :" +arr[i][j]);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("new program start here");
		int[][] arr2 = new int [2][2]; 
	    for (int i = 0; i < 2; i++) { 
	        for (int j = 0; j < 2; j++) { 
	            System.out.print(arr2[i][j] + " "); 
	        } 
	    } 
		

	}

}
