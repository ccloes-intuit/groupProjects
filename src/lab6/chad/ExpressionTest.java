package lab6.chad;

public class ExpressionTest
{

	public static void main (String[] args) {
		
		BinaryTree myTree;
		String expr = "((((3+1)∗3)/((9-5)+2))-((3∗(7-4))+6))";
		Expression myExp = new Expression();
		myTree = myExp.buildExpression(expr);
		
		System.out.println("Original String =   " + expr);
		
		System.out.printf("Traversed tree =    ");
		myTree.inOrderTraverseTree(myTree.root);
		
		System.out.println("\n");
		System.out.printf("preOrderTraverse = ");
		myTree.preOrderTraverseTree(myTree.root);
		
		System.out.println("\n");
		System.out.printf("postOrderTraverse = ");
		myTree.postOrderTraverseTree(myTree.root);
		
		System.out.println("\n");
		System.out.println("Evaluate should be -13 (ran out of time)");
	}
	
}
