package fundamentals;

public class ReverseNew {

	public static void main(String[] args) {
		
		
		int n = 10400;
		int rn =0;
//		int temp = n;
		while(n>0) {
			int rem = n%10;
			
			rn = rn*10+rem;
			n=n/10;
			
			
		}
		System.out.println(rn);
	
		
	}

}
