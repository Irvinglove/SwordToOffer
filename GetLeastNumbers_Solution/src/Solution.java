import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Solution {
    static public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	HashSet<Integer> hash = new HashSet<Integer>();
    	int len = input.length;
    	if(k > len || k <= 0){
    		return list;
    	}
    	for(int i = 0; i < len; i++){
    		if(hash.size() < k){
    			hash.add(input[i]);
    		}else{
    			if( input[i] < Collections.max(hash) ){
    				hash.remove(Collections.max(hash));
    				hash.add(input[i]);
    			}
    		}
    	}
    	Object[] result = hash.toArray();
    	for(int i = 0; i < k; i++){
    		list.add((int)result[i]);
    	}
    	return list;
    }
    public static void main(String[] args) {
		int[] arr = {4,5,1,6,2,7,3,8};
		System.out.println(GetLeastNumbers_Solution(arr, 0));
	}
}