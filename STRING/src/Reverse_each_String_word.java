
public class Reverse_each_String_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  [abc def ghi]
		String input = "abc def gmi";
		String ans="";
		int current=0;
		int i =0;
        for(;i<input.length();i++){
            
            if(input.charAt(i) == ' '){
            	int currentEnd = i-1;
            	String reverse="";
                for(int j=current;j<=currentEnd;j++){
                    reverse = input.charAt(j) + reverse;
                }
                ans+=reverse+" ";
                current=i+1;

            }        
         
        }
        
        int currentEnd = i-1;
    	String reverse="";
        for(int j=current;j<=currentEnd;j++){
            reverse = input.charAt(j) + reverse;
        }
        ans+=reverse;
        
        System.out.println(ans);
        
        
        


	}

}
