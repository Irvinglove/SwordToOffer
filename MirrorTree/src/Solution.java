
public class Solution {
	static public void Mirror(TreeNode root) {
        if(root == null){
        	return;
        }
        if(root.left == null && root.right == null){
        	return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left != null)
        	Mirror(root.left);
        if(root.right != null)
        	Mirror(root.right);
    }
	public static void main(String[] args) {
		
	}
}
