import java.util.ArrayList;
public class Solution {
    static public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
    	ArrayList<ArrayList<Integer> > result = new ArrayList<ArrayList<Integer> >();
    	
    	int i = 1;
    	int j = 2;
    	while(j <= 100 && i < j){
    		ArrayList<Integer> list = new ArrayList<Integer>();
    		if(sum(i,j) < sum){
    			j++;
    		}else if(sum(i, j) > sum){
    			i++;
    		}else{
    			for(int k = i; k <= j; k++){
    				list.add(k);
    	    	}
    			result.add(list);
    			i++;
    		}
    	}
    	return result;
    	
    }
    static public int sum(int i, int j){
    	int sum = 0;
    	for(int k = i; k <= j; k++){
    		sum += k;
    	}
    	return sum;
    }
    public static void main(String[] args) {
		System.out.println(FindContinuousSequence(15));
	}
}