
public class Reverse_String {

	public static String Reverse(String str) {
		String revString = "";
//		this is is loop reverse form ans
//		for(int i=str.length()-1;i>=0;i--) {
//			revString+=str.charAt(i);
//		}
		
		//now the loop in forward form ans
		for(int i=0;i<str.length();i++) {
			revString = str.charAt(i) + revString;
		}
		return revString;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Divyansh Singh";
		String Reversed = Reverse(str);
		System.out.println(Reversed);
		
//		String str1="abc";
//		String str2=new String("abc");
//		System.out.println(str1==str2);

//		String str1="abc";
//		String str2=new String("abc");
//		System.out.println(str1.equals(str2));
		
//		String str1="abc";
//		String str2=str1+" ";
//		System.out.println(str1==str2);
		
		String str1="abc";
		String str2="";
		System.out.println(str1.contains(str2));
	}

}
