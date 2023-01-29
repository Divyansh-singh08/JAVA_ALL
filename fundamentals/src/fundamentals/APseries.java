package fundamentals;

public class APseries {

	public static void main(String[] args) {
		
		int n = 10;
		for(int i=1;i<=n;i++) {
			int value = (3*i+2);
			if(value %4 == 0) {
				n++;
				continue;
				
			}
			System.out.print(value+" ");
			
		}

	}

}
