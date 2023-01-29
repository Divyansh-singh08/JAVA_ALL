
public class BSTUse {

	public static void main(String[] args) {
		BST b = new BST();
		b.insert(1);
		b.insert(3);
		b.insert(8);
		b.insert(34);
		b.insert(1);
		b.insert(9);
		b.printTree();
		System.out.println(b.isPresent(3));
		b.DeleteData(3);
		System.out.println(b.isPresent(3));
		b.printTree();
		

	}

}
