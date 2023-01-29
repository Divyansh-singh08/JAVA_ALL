import java.util.Scanner;

public class Functionwith2darrays {
	
	//to print the 2d array 
	
	public static void printArray(int[][] arr) {
		//now need to print the 2D array now 
//		int rows = arr.length;
//		int cols = arr[0].length;
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		int row = arr.length;
        int col = arr[0].length;
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum=sum+arr[i][j];
            }
            System.out.print(sum+" ");
        }
	}

	//two main function will be taking the input 
	
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
	
	
	public static void main(String[] args) {
		int[][] input = takeInput();
		printArray(input);
		
	}
}
