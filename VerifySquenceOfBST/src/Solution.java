import java.util.Arrays;

public class Solution {
	static public boolean VerifySquenceOfBST(int [] sequence) {
		int len = sequence.length;
		if(len == 0 || sequence == null){
			return false;
		}
		int root = sequence[len - 1];
		int i = 0;
		for(; i < len - 1; i++){
			if(sequence[i] > root){
				break;
			}
		}
		int j = i;
		for(; j < len - 1; j++){
			if(sequence[j] < root){
				return false;
			}
		}
		//如果存在左子树
		boolean left = true;
		if(i > 0){
			left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
		}
		//如果存在右子数
		boolean right = true;
		if(i < len - 1){
			right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, len - 1));
		}
		return left && right;
    }
	public static void main(String[] args) {
		int[] sequence = {5,7,6,9,11,10,8};
		System.out.println(VerifySquenceOfBST(sequence));
	}
}
