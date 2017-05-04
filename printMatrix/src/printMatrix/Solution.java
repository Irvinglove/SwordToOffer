package printMatrix;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	static public ArrayList<Integer> printMatrix(int [][] matrix) {
		int rows = matrix.length;
	    int cols = matrix[0].length;
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    for(int start = 0; start * 2 < rows && start * 2 < cols; start++){
	    	int Xend = cols - 1 - start;
	    	int Yend = rows - 1 - start;
	    	//从左到右insert一行
	    	for(int i = start; i <= Xend; i++){
	    		result.add(matrix[start][i]);
	    	}
	    	//从上到下insert一列
	    	if(start < Yend){
	    		for(int i = start + 1; i <= Yend; i++){
		    		result.add(matrix[i][Xend]);
		    	}
	    	}
	    	//从右到左insert一行
	    	if(start < Yend && start < Xend){
	    		for(int i = Xend - 1; i >= start; i--){
		    		result.add(matrix[Yend][i]);
		    	}
	    	}
	    	//从下到上insert一列
	    	if(start < Yend && start < Xend && Yend - start > 1){
	    		for(int i = Yend - 1; i > start; i--){
		    		result.add(matrix[i][start]);
		    	}
	    	}
	    }
	    return result;
    }
	public static void main(String[] args) {
		int [][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		ArrayList<Integer> result = printMatrix(matrix);
		System.out.println(result);
		
	}
}
