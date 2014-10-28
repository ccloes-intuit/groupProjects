package lab6.chad;

import java.util.Stack;

import lab6.chad.BinaryTree.Node;

public class BinaryTree
{
	Node root;

	public void addRoot(String name) {
		root = new Node(0, name);
	}
	public void addNode(int key, String name)
	{
		// Create a new Node and initialize it
		Node newNode = new Node(key, name);
		// If there is no root this becomes root
		if (root == null)
		{
			root = newNode;
		} else
		{
			// Set root as the Node we will start
			// with as we traverse the tree
			Node focusNode = root;
			// Future parent for our new Node
			Node parent;
			while (true)
			{
				// root is the top parent so we start
				// there
				parent = focusNode;
				// Check if the new node should go on
				// the left side of the parent node
				if (key < focusNode.key)
				{
					// Switch focus to the left child
					focusNode = focusNode.leftChild;
					// If the left child has no children
					if (focusNode == null)
					{
						// then place the new node on the left of it
						parent.leftChild = newNode;
						return;
						// All Done
					}
				} else
				{
					// If we get here put the node on the right
					focusNode = focusNode.rightChild;
					// If the right child has no children
					if (focusNode == null)
					{
						// then place the new node on the right of it
						parent.rightChild = newNode;
						return;
						// All Done
					}
				}
			}
		}
	}

	// All nodes are visited in ascending order
	// Recursion is used to go to one node and
	// then go to its child nodes and so forth
	public void inOrderTraverseTree(Node focusNode)
	{
		if (focusNode != null)
		{
			// Traverse the left node
			if (focusNode.leftChild != null) {
				System.out.print("(");
			}
			inOrderTraverseTree(focusNode.leftChild);
			// Visit the currently focused on node
			System.out.print(focusNode);
			// Traverse the right node
			inOrderTraverseTree(focusNode.rightChild);
			if (focusNode.rightChild != null) {
				System.out.print(")");
			}
		} 
	}
	
	public void preOrderTraverseTree(Node focusNode)
	{
		if (focusNode != null)
		{
			System.out.printf(focusNode.toString());
			preOrderTraverseTree(focusNode.leftChild);
			preOrderTraverseTree(focusNode.rightChild);
		}
	}

	public void postOrderTraverseTree(Node focusNode)
	{
		if (focusNode != null)
		{
			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);
			System.out.printf(focusNode.toString());
		}
	}

	public Node findNode(int key)
	{
		// Start at the top of the tree
		Node focusNode = root;
		// While we haven't found the Node
		// keep looking
		while (focusNode.key != key)
		{
			// If we should search to the left
			if (key < focusNode.key)
			{
				// Shift the focus Node to the left child
				focusNode = focusNode.leftChild;
			} else
			{
				// Shift the focus Node to the right child
				focusNode = focusNode.rightChild;
			}
			// The node wasn't found
			if (focusNode == null)
				return null;
		}
		return focusNode;
	}

	class Node
	{
		int key;
		String name;
		Node leftChild;
		Node rightChild;

		Node(int key, String name)
		{
			this.key = key;
			this.name = name;
		}

		public String toString()
		{
			return name;
			/*
			 *  * return name + " has the key " + key + "\nLeft Child: " +
			 * leftChild + * "\nRight Child: " + rightChild + "\n";
			 */
		}

	}

	public void attach(Node root2, BinaryTree t1, BinaryTree t2)
	{
		root2.leftChild = t1.root;
		root2.rightChild = t2.root;
	}
	public void inOrderTraverseTree()
	{
		// TODO Auto-generated method stub
		
	}
}
