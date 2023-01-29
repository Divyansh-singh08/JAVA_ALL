
public class StackUsingArray {

	private int data[];
	private int topIndex; //index of the top most elem in the stack
	
	//constructor
	public StackUsingArray() {
		data = new int[2];//array of size 2/10...
		topIndex  = -1;
	}
	
	public StackUsingArray(int size) {
		data = new int[size];//array of size 10...
		topIndex  = -1;
	}
	
	//o(1) time
	public int size() {
		return topIndex + 1;
	}
	
	//o(1) time
	public boolean isEmpty() {
//		if(topIndex == -1) {
//			return true;
//		}else {
//			return false;
//		}
		
		return topIndex == -1; 
	}
	
	
	//o(1) time insert as well
//	public void push(int elem) throws StackFullException {
//		//If stack is full the throw stackOverflow error
//		if(topIndex == data.length - 1) {
//			//Throw Exception
////			StackFullException e = new StackFullException();//object create
////			throw e;
//			throw new StackFullException();
//		}
////		topIndex++;
//		data[++topIndex] = elem;
//	}
//	
	
	
//	############### Double the Stack Size from previous one...###############
	public void push(int elem) {
		//If stack is full the throw stackOverflow error
		if(topIndex == data.length - 1) {
			//Throw Exception
//			StackFullException e = new StackFullException();//object create
//			throw e;
			doubleCapacity();
		}
//		topIndex++;
		data[++topIndex] = elem;
	}
	//this method should be private so that no one can change it 
	private void doubleCapacity() {
		System.out.println(" Double Capacity ");
		int temp[] = data;
		data = new int[2 * temp.length ];//double the size
		//copy the previous array value to the new stack array
		for(int i=0;i<temp.length;i++) {
			data[i] =  temp[i];
		}
		
	}

	//o(1) time
	public int top() throws StackEmptyException {
		if(topIndex == -1) {
			//Throw stackEmptyException..
			throw new StackEmptyException();
		}
		return data[topIndex];
	}
	
	//o(1) time
	public int pop() throws StackEmptyException {//remove element
		if(topIndex == -1) {
			//Throw stackEmptyException..
			throw new StackEmptyException();
		}
			int temp = data[topIndex];
			topIndex--;
			return temp;
			
	}
	
}
