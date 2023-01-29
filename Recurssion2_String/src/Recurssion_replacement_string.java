
public class Recurssion_replacement_string {

	public static String replace(String s,char a, char b) {
		//base case
		if(s.length() == 0) {
			return s;
		}
		
		//logic part 
		String small = replace(s.substring(1),a,b);
		if(s.charAt(0) == a) { // return if match it !..
			return b + small;
		}else {
			return s.charAt(0)+small;//return if not match it 
		}
	}
	
	
	//remove pi in 3.14
	
	public static String remove_pi(String s) {
		//base case
		if(s.length() <= 1) {
			return s;
		}
		
		//logic part
		
		if(s.charAt(0) == 'p' && s.charAt(1) == 'i') {
			//call recursion on string  of length n-2 
			
			String small = remove_pi(s.substring(2));
			return  "3.14" + small;
		}else {
			//in this case call recursion on string of length n-1
			String small = remove_pi(s.substring(1));
			return s.charAt(0) + small;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(replace("Divzansh",'z','y'));
//		System.out.println(replace("figh",'x','y'));
		
		System.out.println(remove_pi("apiapipipipiip"));
		

	}

}
