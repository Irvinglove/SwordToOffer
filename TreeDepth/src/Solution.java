import java.util.ArrayList;
import java.util.Arrays;

/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    static public int TreeDepth(TreeNode root) {
    	if(root == null){
    		return 0;
    	}
    	int left = 0;
    	int right = 0;
    	if(root != null){
        	if(root.left != null){
        		 left = TreeDepth(root.left);
        	}
        	if(root.right != null){
        		 right = TreeDepth(root.right);
        	}
        }
    	return (left > right)?(left + 1):(right + 1);
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
		int[] pre = {1,2,4,5,3,6};
		int[] in = {4,2,5,1,3,6};
		System.out.println(TreeDepth(reConstructBinaryTree(pre,in)));
	}
}