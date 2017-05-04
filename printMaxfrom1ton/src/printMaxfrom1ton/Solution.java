package printMaxfrom1ton;

import java.util.Arrays;

public class Solution {
	static public void printMaxfrom1ton(int n) {
        int[] number = new int[n];
        while(!Increment(number)){
        	System.out.println(Arrays.toString(number));
        }
    }
	static public boolean Increment(int[] number){
		int len = number.length;
		number[len - 1] ++;
		for(int i = len - 1; i > 0; i--){
			if(number[i] > 9){
				number[i] = 0;
				number[i - 1]++;
			}
		}
		if(number[0] > 9){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		printMaxfrom1ton(5);
	}
}

