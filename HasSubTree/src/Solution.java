
public class Solution {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
		if(root1 != null && root2 != null){
			if(root1.val == root2.val){
				result = tree1hastree2(root1,root2);
			}
			if(!result){
				result = HasSubtree(root1.left, root2);
			}
			if(!result){
				result = HasSubtree(root1.right, root2);
			}
		}
		return result;
    }
	public boolean tree1hastree2(TreeNode root1,TreeNode root2){
		if(root1 == null || root2 == null){
			return false;
		}
		if(root1.val != root2.val){
			return false;
		}
		return tree1hastree2(root1.left, root2.left) && tree1hastree2(root1.right, root2.right);
	}
	public static void main(String[] args) {
		
	}
}
