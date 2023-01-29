import java.util.Stack;

public class basicStackDemo {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();//stack created
		
		st.push(30);//b1
		st.push(20);//b2
		st.push(11);//b2
		System.out.println(st);
		System.out.println(st.peek()); 
		st.push(55);
		st.push(85);
		st.pop();
		System.out.println(st);
		System.out.println(st.peek()+" size of stack  "+st.size());
		

	}

}
