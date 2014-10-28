package lab6.chad;

import java.util.Stack;

import net.datastructures.LinkedBinaryTree;
import net.datastructures.Position;
import net.datastructures.Tree;

public class Expression {
	
	//public LinkedBinaryTree<T> buildExpression (String expression){
	public BinaryTree buildExpression (String expression){
		
		Stack<BinaryTree> s = new Stack<BinaryTree>();
		
		for (int i = 0; i < expression.length(); i++){
		    Character c = expression.charAt(i);
		    if (c > 42 || String.valueOf(c).matches("[-/+0-9]")){
//		    	System.out.println("This is not a paren - " + c.toString());
		    	BinaryTree T = new BinaryTree();
		    	T.addNode(c, String.valueOf(c));
		    	s.push(T);
		    }
		    else if(c.toString().matches("[(]")){
//		    	System.out.println("This is a left paren - " + c.toString());
		    }
		    else {
//		    	System.out.println("This is a right paren - " + c.toString());
		    	BinaryTree T2 = s.pop();
		    	BinaryTree T = s.pop();
		    	BinaryTree T1 = s.pop();
		    	T.attach(T.root, T1, T2);
		    	s.push(T);
		    }
		}
		return s.pop();
	}

}
