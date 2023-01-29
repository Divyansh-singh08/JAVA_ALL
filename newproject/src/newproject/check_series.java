package newproject;
import java.util.*;
public class check_series {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1 = s.nextInt();
		
		int n2 = s.nextInt();
		boolean isDec = true;
		int i=1;
		while(i < n-1) {
			if(isDec && n1>n2) {
				System.out.println(isDec);
			}else if(n1<n2 && isDec) {
				isDec= false;
				System.out.println(isDec);
			}else {
				System.out.println("false");
			}
			n1=n2;
			n2=s.nextInt();
			i++;
			
		}
	}

}
