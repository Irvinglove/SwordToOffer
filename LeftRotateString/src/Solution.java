public class Solution {
    static public String LeftRotateString(String str,int n) {
    	if(str == ""){
    		return "";
    	}
    	char[] str_arr = str.toCharArray();
    	int len = str_arr.length;
    	n = n % len;
        Reverse(str_arr, 0, n - 1);
        Reverse(str_arr, n, len - 1);
        Reverse(str_arr, 0, len - 1);
        String result = "";
        for(int i = 0; i < len; i++){
    		result += str_arr[i];
    	}
        return result;
    }
    static public String Reverse(char[] str_arr, int start, int end){
    	int left = start;
    	int right = end;
    	while(left < right){
    		char temp = str_arr[left];
    		str_arr[left] = str_arr[right];
    		str_arr[right] = temp;
    		left++; right--;
    	}
    	String result = "";
    	for(int i = 0; i < str_arr.length; i++){
    		result += str_arr[i];
    	}
    	return result;
    }
    public static void main(String[] args) {
		String str = "abcdefg";
		System.out.println(LeftRotateString(str, 2));
	}
}