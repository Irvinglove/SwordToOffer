package multiply;

import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    static public int[] multiply(int[] A) {
    	int len = A.length;
		int[] c_arr = new int[len];
		int[] d_arr = new int[len];
		int[] B = new int[len];
		c_arr[0] = 1;
		d_arr[len - 1] = 1;
		for(int i = 1; i < len; i++){
			c_arr[i] = c_arr[i - 1] * A[i - 1];
		}
		for(int i = len - 2; i >= 0; i--){
			d_arr[i] = d_arr[i + 1] * A[i + 1];
		}
		for(int i = 0; i < len; i++){
			B[i] = c_arr[i] * d_arr[i];
		}
		return B;
    }
    public static void main(String[] args) {
		int[] A = {1,2,3,4};
		System.out.println(Arrays.toString(multiply(A)));
	}
}