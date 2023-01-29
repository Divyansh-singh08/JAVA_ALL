
public class QueueUse {

	public static void main(String[] args) {
		QueueUsingArray queue = new QueueUsingArray();//object created
		int  arr[] = {10,20,50,30,61};
		for(int elem : arr) {
//			try {
				queue.enqueue(elem);
//			} catch (QueueFullException e) {
//				
//			}
		}
		
		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				//never will reach here
				
			}
		}

	}

}
