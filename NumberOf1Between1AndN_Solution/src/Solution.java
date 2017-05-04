public class Solution {
	/*
       例子:
        以算百位上1为例子:   假设百位上是0, 1, 和 >=2 三种情况: 
        case 1: n=3141092, a= 31410, b=92. 计算百位上1的个数应该为 3141 *100 次.
        case 2: n=3141192, a= 31411, b=92. 计算百位上1的个数应该为 3141 *100 + (92+1) 次. 
        case 3: n=3141592, a= 31415, b=92. 计算百位上1的个数应该为 (3141+1) *100 次. 
        以上三种情况可以用 一个公式概括:
        (a + 8) / 10 * m + (a % 10 == 1) * (b + 1);
    */
	static public int NumberOf1Between1AndN_Solution(int n) {
		int ones = 0;
    	for(int m = 1; m <= n; m = m * 10){
    		int big = n / m; 
    		int sma = n % m;
    		ones += (big + 8)/10 * m;
    		if(big % 10 == 1) ones += sma + 1;
    	}
    	return ones;
    }
    public static void main(String[] args) {
		System.out.println(NumberOf1Between1AndN_Solution(10));
	}
}