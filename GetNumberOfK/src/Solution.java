public class Solution {
    static public int GetNumberOfK(int [] arr , int k) {
    	int number = 0;
    	if(arr != null){
    		int first = GetFirstNumberOfK(arr, k, 0, arr.length - 1);
    	    int last = GetLastNumberOfK(arr, k, 0, arr.length - 1);
    	    if(first > -1 && last > -1){
    	    	number = last - first + 1;
    	    }
    	}
       
    	return number;
    }
    static public int GetFirstNumberOfK(int [] arr , int k, int start, int end) {
    	if(start > end){
    		return -1;
    	}
        int mid = (start + end) >> 1;
        if(arr[mid] == k){
        	if((mid > 0 && arr[mid - 1] != k) || mid == 0 ){
        		return mid;
        	}else{
        		end = mid - 1;
        	}
        }else if(arr[mid] > k){
        	end = mid - 1;
        }else{
        	start = mid + 1;
        }
        return GetFirstNumberOfK(arr, k, start, end);
    }
    static public int GetLastNumberOfK(int [] arr , int k, int start, int end) {
    	if(start > end){
    		return -1;
    	}
    	int mid = (start + end) >> 1;
        if(arr[mid] == k){
        	if((mid < arr.length - 1 && arr[mid + 1] != k) || mid == arr.length - 1){
        		return mid;
        	}else{
        		start = mid + 1;
        	}
        }else if(arr[mid] > k){
        	end = mid - 1;
        }else{
        	start = mid + 1;
        }
        return GetLastNumberOfK(arr, k, start, end);
    }
    public static void main(String[] args) {
		int[] arr = {3,3,3,3,3,3,4,5};
		System.out.println(GetNumberOfK(arr, 3));
	}
}