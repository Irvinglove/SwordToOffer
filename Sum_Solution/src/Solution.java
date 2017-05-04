public class Solution {
	static public int Sum_Solution(int n) {
        int ans = n ;
        boolean t = (ans) != 0 && ((ans += Sum_Solution(ans - 1)) != 0);
        return ans;
    }
    public static void main(String[] args) {
		System.out.println(Sum_Solution(5));
	}
}