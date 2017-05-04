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
    
    static List<TreeNode> list = new ArrayList<TreeNode>();
    static public List<TreeNode> inorderTraversal(TreeNode root) {
        
        if(root != null){
        	if(root.left != null){
        		inorderTraversal(root.left);
        	}
        	list.add(root);
        	if(root.right != null){
        		inorderTraversal(root.right);
        	}
        }
        return list;
    }
    static TreeNode KthNode(TreeNode pRoot, int k){
    	list = inorderTraversal(pRoot);
    	int len = list.size();
    	if(k == 0 || k > len){
    		return null;
    	}
    	return list.get(k - 1);
    }
    public static void main(String[] args) {
		int[] pre = {5,3,2,4,7,6,8};
		int[] in = {2,3,4,5,6,7,8};
		System.out.println(KthNode(reConstructBinaryTree(pre,in),1).val);
	}

}