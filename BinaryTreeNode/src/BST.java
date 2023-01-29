
public class BST {
	
	private BinaryTreeNodes<Integer> root;
	private int size;
	private static boolean isPresentHelper(BinaryTreeNodes<Integer> node,int x) {
		//base case
		if(node == null) return false;
		
		if(node.data == x) {
			return true;
		}
		
		if(x < node.data) {
			//call on the left Side...
			return isPresentHelper(node.left,x);
		}else {
			//call on the right Side...
			return isPresentHelper(node.right,x);
		}
	}
	
	
	public boolean isPresent(int x) {
		return isPresentHelper(root,x);
	}
	
	public void insert(int x) {
		
	}
	
	public boolean DeleteData(int x) {
		return false;
	}
	
	public int size() {
		return size;
	}
	
	public static void printTreeHelper(BinaryTreeNodes<Integer> node) {
		//this base case is more good and easy to understand
				if(node == null) {
					return;
				}
				System.out.print(node.data + ":");
				
				
				if(node.left != null) {
					System.out.print(node.left.data + "L " +"," );
				}
				if(node.right != null) {
					System.out.print(node.right.data + "R" );
				}
				
				System.out.println();
				
				
				  ////another way
				printTreeHelper(node.left);
				printTreeHelper(node.right);
	}
	
	public void printTree() {
		printTreeHelper(root);
	}
}
