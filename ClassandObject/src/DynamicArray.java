
public class DynamicArray {
	
	private int data[];
	private int nextElementIndex;
	
	//constructor
	
	public DynamicArray() {
		data = new int[5];
		nextElementIndex = 0;
		
	}
	
	public int size() {
		return nextElementIndex;
	}
	
	public boolean isEmpty() {
		return nextElementIndex == 0;
	}
	
	public int get(int i) {
		
		if(i >= nextElementIndex) {
			//throw error
			return -1;
		}
		return data[i];
	}
	
	
	public void set(int i,int ele) {
		if(i >= nextElementIndex) {
			//throw error
			return;
		}
		data[i] = ele;
		
	}
	
	public void add(int ele) {
		
		if(nextElementIndex == data.length) {
			doubleCapacity();
		}
		
		data[nextElementIndex] = ele;
		nextElementIndex++;
	}

	private void doubleCapacity() {
		
		int temp[] = data;
		data = new int[2 * temp.length];
		for(int i=0; i < temp.length; i++) {
			data[i] =  temp[i];
		}
		
	}
	
	public int removeLast() {
		if(nextElementIndex ==  0) {
			return -1;
		}
		int temp = data[nextElementIndex - 1];
		data[nextElementIndex - 1] = 0;
		nextElementIndex--;
		return temp;
	}
}
