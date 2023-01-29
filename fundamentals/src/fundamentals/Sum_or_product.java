package fundamentals;
import java.util.*;
public class Sum_or_product {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int c = s.nextInt();
		int sum=0;
		int pro =1;
		if(c==1) {
			for(int i=1;i<=n;i++) {
				sum=sum+i;
			}
			System.out.println(sum);
		}else if(c==2) {
			for(int i=1;i<=n;i++) {
				pro=pro*i;
			}
			System.out.println(pro);
		}else {
			System.out.println("-1");
		}

	}

}
