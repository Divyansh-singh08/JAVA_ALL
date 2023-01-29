import java.util.*;

public class ValidAnagram {
	
	public static boolean valid_angram(String s,String t) {
		if(s.length() != t.length()) {
			return false;
		}
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			//condition
			if(map.containsKey(s.charAt(i))==false) {
				//not present
				map.put(s.charAt(i), 1);
			}else {
				//update 
				int size = map.get(s.charAt(i));
				map.put(s.charAt(i), size+1);
			}
		}
		
		for(int i = 0; i < t.length(); i++) {
			if(map.containsKey(t.charAt(i))) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		
//		for(int  )
		String s = "aacc";
		String t = "ccac";//wrong answer
		
		boolean ans = valid_angram(s,t);
		System.out.println(ans);
		

	}

}
