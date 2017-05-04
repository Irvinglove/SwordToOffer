public class Solution {
	static public String ReverseSentence(String str) {
		if(str.equals("")){
    		return "";
    	}
    	char[] str_arr = str.toCharArray();
    	int len = str_arr.length;
        Reverse(str_arr, 0, len - 1);
        int start = 0, end = 0;
        for(int i = 0; i < len; i++){
        	if(str_arr[i] == ' ' && i < len - 1){
        		end = i - 1;
        		Reverse(str_arr, start, end);
        		start = i + 1;
        	}
        	if(i == len - 1){
        		end = i;
        		Reverse(str_arr, start, end);
        	}
        }
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
		String str = " abcd efg";
		System.out.println(ReverseSentence(str));
	}
}