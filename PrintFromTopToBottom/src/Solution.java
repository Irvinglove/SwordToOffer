import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class Solution {
	static public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root != null){
        	queue.offer(root);
        }
        while(!queue.isEmpty()){
        	TreeNode temp = queue.poll();
        	result.add(temp.val);
        	if(temp.left != null)
        		queue.offer(temp.left);
        	if(temp.right != null)
        		queue.offer(temp.right);
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
		/*int[] pre = {8,6,5,7,10,9,11};
		int[] in = {5,6,7,8,9,10,11};*/
		int[] pre = {};
		int[] in = {};
		System.out.println(PrintFromTopToBottom(reConstructBinaryTree(pre,in)));
		
	}
}
