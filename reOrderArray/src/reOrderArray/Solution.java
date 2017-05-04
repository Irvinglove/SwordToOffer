package reOrderArray;

import java.util.Arrays;

public class Solution {
	static public void reOrderArray(int [] array) {
		int len = array.length;
		int odd_count = 0;
		int even_count = 0;
        for(int i = 0; i < len; i++){
        	if((array[i] & 1) == 1){
        		odd_count++;
        	}
        }
        int[] result = new int[len];
        for(int i = 0; i < len; i++){
        	if((array[i] & 1) == 1){
        		result[even_count] = array[i];
        		even_count++;
        	}else{
        		result[odd_count] = array[i];
        		odd_count++;
        	}
        }
        for(int i = 0;i < len; i++){
            array[i]=result[i];
        }
    }
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		reOrderArray(array);
	}
}
