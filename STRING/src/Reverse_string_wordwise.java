
public class Reverse_string_wordwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="welcome to coding ninja";
		String ans="";
		String ans2="";
		int count = str.length()-1;
		
		int i=str.length()-1;
		for(;i>=0;i--)
		{
			
			
			if(str.charAt(i) == ' ') {
				int point = i+1;
				String store="";
				for(int j=count;j>=point;j--) {
					store+=str.charAt(j);
				}
				ans+=store+" ";
				count=point-1;
			}
			
		}
		
		int point = i+1;
		String store="";
		for(int j=count;j>=point;j--) {
			store+=str.charAt(j);
		}
		ans+=store;
//		System.out.println(ans);
		
		//do it for the ans 
		
		
		int count1 = 0;
		
		int k=0;
		for(;k<ans.length();k++)
		{
			
			
			if(ans.charAt(k) == ' ') {
				int point1 = k-1;
				String store1="";
				for(int j=count1;j<=point1;j++) {
					store1=ans.charAt(j)+store1;
				}
				ans2+=store1+" ";
				count1=k+1;
			}
			
		}
		
		int point1 = k-1;
		String store1="";
		for(int j=count1;j<=point1;j++) {
			store1=ans.charAt(j)+store1;
		}
		ans2+=store1;
		
		System.out.println(ans2);
		

	}

}
