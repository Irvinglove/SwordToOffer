import java.util.ArrayList;
public class Solution {
    static public ArrayList<Integer> FindNumbersWithSum(int [] arr,int sum) {
    	ArrayList<Integer> list = new ArrayList<Integer> ();
        int len = arr.length;
        int i = 0;
        int j = len - 1;
        while(i < j){
        	if(arr[i] + arr[j] < sum){
        		i++;
        	}else if(arr[i] + arr[j] > sum){
        		j--;
        	}else{
        		list.add(arr[i]);
                list.add(arr[j]);
                return list;
        	}
        }
        return list;
        
    }
    public static void main(String[] args) {
		int[] arr = {1,2,4,7,11,15};
		System.out.println(FindNumbersWithSum(arr, 10));
	}
}