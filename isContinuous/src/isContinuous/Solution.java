package isContinuous;

import java.util.Arrays;

public class Solution {
	static public boolean isValid = true;
    static public boolean isContinuous(int [] num) {
    	int len = num.length;
    	if(len != 5){
    		return false;
    	}
    	int count0 = 0;
    	for(int i = 0; i < 5; i++){
    		if(num[i] == 0){
    			count0++;
    		}
    	}
    	int gap = 0;
    	Arrays.sort(num);
    	for(int i = 0; i < 4; i++){
    		if(num[i] != 0){
    			if(num[i] == num[i + 1]){
        			return false;
        		}
    			gap += num[i + 1] - num[i] - 1; 
    		}
    	}
    	if(gap > count0){
    		return false;
    	}
    	return true;
    }
    public static void main(String[] args) {
		int[] num = {1,2,5,0,0};
		System.out.println(isContinuous(num));
	}
}