public class Solution {
	static public int FindGreatestSumOfSubArray(int[] arr) {
        if(arr == null){
        	return 0;
        }
        int curSum = 0;
        int greatSum = -Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
        	if(curSum < 0){
        		curSum = arr[i];
        	}else{
        		curSum += arr[i]; 
        	}
        	if(curSum > greatSum){
        		greatSum = curSum;
        	}
        }
        return greatSum;
    }
    public static void main(String[] args) {
		int[] arr = {1,-2,3,10,-4,7,2,-5};
		System.out.println(FindGreatestSumOfSubArray(arr));
	}
}