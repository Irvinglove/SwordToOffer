import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
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
	static List<Integer> list = new ArrayList<Integer>();
	static public List<Integer> inorderTraversal(TreeNode root) {
        
        if(root != null){
        	if(root.left != null){
        		inorderTraversal(root.left);
        	}
        	list.add(root.val);
        	if(root.right != null){
        		inorderTraversal(root.right);
        	}
        }
        return list;
    }
	
	public static void main(String[] args) {
		int[] pre = {10,6,4,8,14,12,16};
		int[] in = {4,6,8,10,12,14,16};
		System.out.println(inorderTraversal(reConstructBinaryTree(pre,in)));
	}
}
