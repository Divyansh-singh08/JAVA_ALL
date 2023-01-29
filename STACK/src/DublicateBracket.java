import java.util.*;

public class DublicateBracket {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();//input taken
		
		
		Stack<Character> st = new Stack<>(); 
		
		for(int i = 0; i < str.length(); i++)
//		for(char ch : str)
		{
			char ch = str.charAt(i);
			if(ch == ')') 
			{ //check if the stack is having opening bracket at the peek(top)..
				if(st.peek() == '(')
				{//if getting directly opening bracket without any element then true
					System.out.println(true);
					return;
			
				}
				else 
				{
					while(st.peek() != '(') 
					{
						st.pop();
					}
					st.pop();
				}
			}
			else 
			{
				st.push(ch);
			}
			
		}
		
		System.out.println(false);//not get the Duplicate element int the stack
	}

}
