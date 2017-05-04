import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
	static public ArrayList<ArrayList<Integer> > PrintZhiTree(TreeNode pRoot) {
		Stack<TreeNode> stack0 = new Stack<TreeNode>();
		Stack<TreeNode> stack1 = new Stack<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(pRoot != null){
        	stack0.add(pRoot);
        }
        int curLevel = 0;
        int nextLevel = 0;
        int tobePrint = 1;
        while(!stack0.isEmpty() || !stack1.isEmpty()){
	        if(curLevel % 2 == 0){
	        	TreeNode temp = stack0.pop();
	        	list.add(temp.val);
	        	if(temp.left != null){
	        		stack1.add(temp.left);
	        		nextLevel++;
	        	}
	        	if(temp.right != null){
	        		stack1.add(temp.right);
	        		nextLevel++;
	        	}
	        	
	        	
	        }else{
	        	TreeNode temp = stack1.pop();
	        	list.add(temp.val);
	        	if(temp.right != null){
	        		stack0.add(temp.right);
	        		nextLevel++;
	        	}
	        	if(temp.left != null){
	        		stack0.add(temp.left);
	        		nextLevel++;
	        	}
	        	
	        }
	        tobePrint--;
        	if(tobePrint == 0){
        		result.add(list);
        		list = new ArrayList<Integer>();
        		tobePrint = nextLevel;
        		nextLevel = 0;
        		curLevel++;
        	}
        }
        return result;
    }
	static public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length != in.length || pre.length == 0){
        	return null;
        }
        TreeNode tree = new TreeNode(pre[0]);
        int root_index;
        for(root_index = 0; root_index < in.length; root_index++){
        	if(in[root_index] == pre[0]){
        		tree.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, 1 + root_index), Arrays.copyOfRange(in, 0, root_index));
                tree.right = reConstructBinaryTree(Arrays.copyOfRange(pre, root_index + 1, in.length), Arrays.copyOfRange(in, root_index + 1, in.length));
                break;
        	}
        }
        return tree;
    }
	public static void main(String[] args) {
		int[] pre = {8,6,5,7,10,9,11};
		int[] in = {5,6,7,8,9,10,11};
		System.out.println(PrintZhiTree(reConstructBinaryTree(pre,in)));
		
	}
}
