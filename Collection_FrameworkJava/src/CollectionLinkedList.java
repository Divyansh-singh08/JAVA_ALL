import java.util.LinkedList;

public class CollectionLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(20);
		list.add(50);
		list.add(45);
		list.add(78);
		list.add(3, 12);
		list.set(2, 63);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}

	}

}
