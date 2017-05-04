import java.util.LinkedList;

public class Solution {
    static public int LastRemaining_Solution(int n, int m) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
        	arr[i] = i;
        }
        int deleteCount = 0;
        int i = 0;
        while(deleteCount < n - 1){
        	if(deleteCount == 0){
        		for(int j = 0; j < m - 1; j++){
            		i = nextNotEqualMin1(arr, i);
                }
        	}else{
        		for(int j = 0; j < m; j++){
            		i = nextNotEqualMin1(arr, i);
                }
        	}
        	arr[i] = -1;
        	deleteCount++;
        }
        for(int index = 0; index < n; index++){
        	if(arr[index] != -1){
        		return index;
        	}
        }
        return -1;
        
    }
    static int nextNotEqualMin1(int[] arr, int cur){
    	int len = arr.length;
    	int index = cur;
    	while(true){
    		if(index == len - 1){
    			index = 0;
    		}else{
    			index++;
    		}
    		if(arr[index] != -1 ){
    			return index;
    		}
    	}
    }
    public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		System.out.println(LastRemaining_Solution(4,3));
	}
}