import java.util.ArrayList;

public class Implementation_of_priorityQueue<T> {
	
		private ArrayList<Element<T>> storeHeap; 
		
		public Implementation_of_priorityQueue() {
			storeHeap = new ArrayList<>();//Initiation of the ArrayList
			
		}
		
		//InsertMin() function
		public void insertMin(T value,int priority) {
			//inset the value and priority into the storeHeap
			//compair is base on priority only
			
			
			//insert at the last position on the ArrayList(storeHeap)
			Element<T> e = new Element<>(value,priority);
			//now add the element e
			storeHeap.add(e);
			
			//now we check the parent with the child for minHeap 
			//if parent will > greater then child 
			//then we need to swap the value at the index
			//compair parent(value of priority) with child(value of priority) with index
			//child index is last index
			//parent index  = (child_index - 1)/2
			
			int childIndex = storeHeap.size()-1;
			int parentIndex = (childIndex - 1)/2;
			
			//we need to repeat the process till the complete balance tree
			// follow the heap order priority
			//up heapify CBT & HOP
			while(childIndex > 0) {
				//not the base of index --> on the base of priority
				if(storeHeap.get(parentIndex).priority > storeHeap.get(childIndex).priority) {
					//child(priority) is less the parent(priority)
					//need to swap the element(value,priority) present at the index
					//swap
					Element<T> temp = storeHeap.get(childIndex);
					storeHeap.set(childIndex, storeHeap.get(parentIndex));
					storeHeap.set(parentIndex, temp);
					
					//after swaping our childIndex and parentIndex will be updated
					
					childIndex = parentIndex;
					parentIndex = (childIndex - 1)/2;
					
				}else {
					return;//some case where we get the CBT & HOP(High order priority)
				}
			}
			
		}
		
		
		//getMinValue() function
		public T getMinValue() throws PriorityQueueException {
			if(isEmpty()) {
				//storeHeap is Empty
				//priorityQueue is Empty
				throw new PriorityQueueException();
			}
			//storeHeap is not empty
			//we need to get min
			
			return storeHeap.get(0).value;
		}
		
		//getMaxValue() function
		public T getMaxValue() throws PriorityQueueException {
			if(isEmpty()) {
				//storeHeap is Empty
				//priorityQueue is Empty
				throw new PriorityQueueException();
			}
			//storeHeap is not empty
			//we need to get max
			
			return storeHeap.get(storeHeap.size()-1).value;
		}
		
		//remove() function
		public T removeMinValue() throws PriorityQueueException {
			if(isEmpty()) {
				throw new PriorityQueueException();
			}
			
			//element need to remove
			Element<T> remove = storeHeap.get(0);
			T value =  remove.value;//store the value in it for returning
			
			//replace the max value with min value at top(root) 
			storeHeap.set(0,storeHeap.get(storeHeap.size()-1));
			//remove the last node
			storeHeap.remove(storeHeap.size()-1);
			
			int parentIndex = 0;
			int leftchildIndex = 2*parentIndex + 1;
			int rightchildIndex = 2*parentIndex + 2;
			
			//we need to repeat the process till it follow the CBT and HOP
			while(leftchildIndex < storeHeap.size()) {
				//find the minimum index among parentIndex,leftchildIndex,rightchildIndex
				
				int minIndex = parentIndex;//by default initilization
				
				//compair parentIndex value with leftchildIndex value
				if(storeHeap.get(minIndex).priority > storeHeap.get(leftchildIndex).priority) {
					//mean
					//parent priority is more then child priority which is not good in case of minRemove
					//need to maintain the CBT & HOP
					 
					minIndex = leftchildIndex;
				}
				//compair with the Right child Index
				if(rightchildIndex < storeHeap.size() && storeHeap.get(minIndex).priority > storeHeap.get(rightchildIndex).priority) {
					//rightchildIndex < storeHeap.size()
					// there may be only leftchild present and rightchild not present case
					minIndex = rightchildIndex;
				}
				
				//another case where every index is correct placed
				if(minIndex == parentIndex) {
					break;
				}
				
				
				//now the final work we need to swap the parentIndex with the minIndex
				//swaping
				Element<T> temp = storeHeap.get(minIndex);
				storeHeap.set(minIndex, storeHeap.get(parentIndex));
				storeHeap.set(parentIndex, temp);
				
				//now parentIndex and childIndex update
				parentIndex = minIndex;
				leftchildIndex = 2*parentIndex  + 1;
				rightchildIndex = 2*parentIndex + 2;
				
				
			}
			return value;
		
			
		}
		
		//Size()
		public int size() {
			return storeHeap.size();
		}
		
		//isEmpty()
		public boolean isEmpty() {
			if(size() == 0) {
				return true;
			}
			return false;
		}

}
