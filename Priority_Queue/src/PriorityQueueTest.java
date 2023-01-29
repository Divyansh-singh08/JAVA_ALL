
public class PriorityQueueTest {

	public static void main(String[] args) throws PriorityQueueException {
//		using Heap
//		1.CBT
//		2.MIN Heap
//		3.Internal we maintain ArrayList for storing
//		priority_queue internal maintain Heap and we will store the Heap into the ArrayList
		
		Implementation_of_priorityQueue<String> pq =  new Implementation_of_priorityQueue<String>();
		pq.insertMin("divyansh", 0);
		pq.insertMin("singh", 13);
		pq.insertMin("rohan", 90);
		pq.insertMin("rohit", 150);
		pq.insertMin("vivek", 1);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.getMinValue());
			pq.removeMinValue();
		}
		
	}

}
