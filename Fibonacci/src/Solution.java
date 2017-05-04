
public class Solution {
	 /*static public int Fibonacci(int n) {
		 	if(n <= 0){
	            return 0;
	        }
		 	if(n <= 2){
		 		return 1;
		 	}
		 	int first = 1;
		 	int second = 1;
		 	int third;
	        for(int i = 3; i < n; i++){
	            third = second + first;
	            first = second;
	            second = third;
	        }
	        return second + first;
	        
	        
	    }*/
	static public int JumpFloor(int n) {
		if(n <= 2){
            return n;
        }
	 	int first = 1;
	 	int second = 2;
	 	int third = 0;
        for(int i = 2; i < n; i++){
            third = second + first;
            first = second;
            second = third;
        }
        return third;
    }
	/*static public int HardJumpFloor(int n) {
		if(n <= 2){
            return n;
        }
		int[] result = new int[n + 1];
		result[0] = 1;
		result[1] = 1;
		result[2] = 2;
        for(int i = 3; i <= n; i++){
        	for(int j = i - 1; j >= 0; j--){
        		result[i] += result[j];
        	}
        }
        return result[n];
    }*/
	 public static void main(String[] args) {
		System.out.println(JumpFloor(3));
	}
}
