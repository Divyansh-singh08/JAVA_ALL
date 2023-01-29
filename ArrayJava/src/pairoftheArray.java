
public class pairoftheArray {

	public static void printAllpairs(int[] pair) {
		int n =pair.length;
		for(int i=0;i<=n-1;i++) {
			for(int j=i+1;j<n;j++) {
				System.out.println("("+pair[i]+")"+"("+pair[j]+")");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr	 = {1,2,5,6,9};
		printAllpairs(arr);
	}

}
