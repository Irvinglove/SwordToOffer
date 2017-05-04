public class Solution {
    static public boolean Find(int target, int [][] array) {
    	if(array.length == 0){
    		return false;
    	}
    	int rows = array.length;
    	int cols = array[0].length;
    	
    	int row = 0;
    	int col = cols - 1;
    	
    	while(row < rows && col >= 0){
    		if(array[row][col] == target){
    			return true;
    		}else if(array[row][col] > target){
    			col--;
    		}else if(array[row][col] < target){
    			row++;
    		}
    	}
    	return false;
    	
    }
    public static void main(String[] args) {
		int[][] array = {{1,2},{3,4}};
		System.out.println(Find(4, array));
		
	}
}