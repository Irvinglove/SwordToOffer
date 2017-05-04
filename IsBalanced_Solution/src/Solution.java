import java.util.Arrays;
import java.util.List;

public class Solution {
	static boolean isBalancedTree = true;
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
    static public boolean IsBalanced_Solution(TreeNode root) {
        getDepth(root);
        return isBalancedTree;
        
    }
    static public int getDepth(TreeNode root){
    	int left = 0;
    	int right = 0;
    	if(root == null){
    		return 0;
    	}
    	left = getDepth(root.left);
    	right = getDepth(root.right);
    	if(Math.abs(left - right) > 1){
    		isBalancedTree = false;
    	}
    	return left>right?(left + 1):(right + 1);
    }
    public static void main(String[] args) {
		int[] pre = {1};
		int[] in = {1};
		System.out.println(IsBalanced_Solution(reConstructBinaryTree(pre,in)));
	}
}