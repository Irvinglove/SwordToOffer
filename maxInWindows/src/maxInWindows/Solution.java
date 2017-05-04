package maxInWindows;
import java.util.ArrayList;

public class Solution {
	static public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < num.length - size + 1; i++){
			list.add(findMax(num, i, i + size - 1));
		}
		return list;
    }
	static public int findMax(int[] num, int start, int end){
		int result = - Integer.MAX_VALUE;
		for(int i = start; i <= end; i++){
			if(result < num[i]){
				result = num[i];
			}
		}
		return result;
	}
    public static void main(String[] args) {
		int[] num = {2,3,4,2,6,2,5,1};
		System.out.println(maxInWindows(num, 3));
	}
}