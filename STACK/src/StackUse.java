
public class StackUse {

	public static void main(String[] args)throws StackFullException, StackEmptyException {
		
		//Stack using the LL(LinkedList)...
		StackUsingLL<Integer> stack =  new StackUsingLL<>();
		
		
		
		
		
		
//		StackUsingArray stack = new StackUsingArray();
		//array element into the stack
		
		
		
		int arr[] = {5,6,7,1,9};
		
		for(int i=0;i < arr.length; i++) {
			stack.push(arr[i]);
		}
		
//		remove all the element into the array
		while(! stack.isEmpty()) {
			System.out.println(stack.pop());
			System.out.println("size of the stack is "+ stack.size());
		}
		
//		System.out.println("size of the stack is "+ stack.size());
		
		
		
		
		
		
		
		
////		stack.data[1] = 100;//this is not possible int the LIFO
//		stack.push(10);
////		stack.top();
//		System.out.println(stack.top());
//		stack.pop();
//		stack.size();
////		stack.isEmpty();
//		System.out.println(stack.isEmpty());
//		stack.pop();

	}

}
