public class Solution {
    static public int GetUglyNumber_Solution(int index) {
    	if(index <= 0){
    		return 0;
    	}
    	int[] arr = new int[index > 5?index:5];
    	int min2 = 0, min3 = 0, min5 = 0;
    	arr[0] = 1;
    	arr[1] = 2;
    	arr[2] = 3;
    	arr[3] = 4;
    	arr[4] = 5;
    	for(int i = 5; i < index; i++){
    		for(int j = 1; j < i; j++){
    			if(arr[j] * 2 > arr[i - 1]){
    				min2 = arr[j] * 2;
    				break;
    			}
    		}
    		for(int j = 1; j < i; j++){
    			if(arr[j] * 3 > arr[i - 1]){
    				min3 = arr[j] * 3;
    				break;
    			}
    		}
    		for(int j = 1; j < i; j++){
    			if(arr[j] * 5 > arr[i - 1]){
    				min5 = arr[j] * 5;
    				break;
    			}
    		}
    		arr[i] = Math.min(Math.min(min2, min3),min5);
    	}
    	
    	
        return arr[index - 1];
    }
    public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(8));
	}
    
}