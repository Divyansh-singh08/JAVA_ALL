import java.util.Scanner;

public class TreeTest {
	
	
	//find the number of Nodes in the Tree
	public static int noOfNodes(TreeNode<Integer> root) {
		//base case
		int count = 1;//standing on the root
		//go each of the children
		for(int i = 0; i < root.children.size(); i++) {
			int childCount = noOfNodes(root.children.get(i));
			count = count + childCount;
		}
		return count;
	}
	
	//need to print the Tree using another function
	//print in the preOrder ways
	public static void printTree(TreeNode<Integer> root) {
		//special case
		if(root == null) {
			return;
		}
		
		//print myself then ask the children to print them self and call their children...
		System.out.print(root.data+" ");
		//call children one by one 
		for(int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTree(child);
		}
		
	}
	
	public static void printTrees(TreeNode<Integer> root) {
		//special case
		if(root == null) {
			return;
		}
		
		//print myself then ask the children to print them self and call their children...
		System.out.print(root.data+": ");
		for(int i = 0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data + " ");
		}
		System.out.println();
		//call children one by one 
		for(int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTrees(child);
		}
		
	}
	//print the Tree in Level-Wise Order
	public static TreeNode<Integer> takeInput() throws QueueEmptyException{
		Scanner s = new Scanner(System.in);
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter the root Data ");
		int rootData = s.nextInt();
		if(rootData == -1) return null;
		TreeNode<Integer> root = new TreeNode<>(rootData);
		pendingNodes.enqueue(root);
		
		while(! pendingNodes.isEmpty()) {
			TreeNode<Integer> front = pendingNodes.dequeue();
			//ask the no of child and enter the no of child
			System.out.println("Enter the number of child for :" +front.data);
			int noOFchild = s.nextInt();
			for(int i = 0; i < noOFchild; i++) {
				System.out.println("Enter the" + i +"th child data for: " + front.data);
				int childData = s.nextInt();
				//now make the childData into the Child TreeNode
				TreeNode<Integer> childNode = new TreeNode<>(childData);
				//now make the connection between them
				front.children.add(childNode);
				//need to put this into the Queue
				pendingNodes.enqueue(childNode);
			}
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO 
//		TreeNode<Integer> root  = new TreeNode<>(4);
//		TreeNode<Integer> node1  = new TreeNode<>(2);
//		TreeNode<Integer> node2  = new TreeNode<>(3);
//		TreeNode<Integer> node3  = new TreeNode<>(1);
//		TreeNode<Integer> node4  = new TreeNode<>(5);
//		TreeNode<Integer> node5  = new TreeNode<>(6);
//		//root add to the children
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		
//		node2.children.add(node4);
//		node2.children.add(node5);//connection made to the child
//		
//		//call the another function
//		printTrees(root);
//		
////		call the function
////		printTree(root);
//		
//		//no of nodes in the generic Tree
//		System.out.println("No of Nodes in the Generic Tree "+noOfNodes(root));
//		
		
		TreeNode<Integer> root = takeInput();
		printTree(root);





	}

}
