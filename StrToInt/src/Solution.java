public class Solution {
	static boolean isValid = true;
    public static int StrToInt(String str) {
    //1、全局变量设置是否合法
    //2、+-
    //3、字符串为空
    	
    	if(str.equals("")){
    		isValid = false;
    		return 0;
    	}
    	int result = 0;
    	char[] str_arr = str.toCharArray();
    	isValid(str_arr);
    	if(isValid){
    		if(str_arr[0] == '+'){
    			int carry = 1;
    			for(int i = str_arr.length - 1; i > 0 ; i--){
        			result += (str_arr[i] - '0') * carry;
        			carry *= 10;
        		}
    		}else if(str_arr[0] == '-'){
    			int carry = 1;
    			for(int i = str_arr.length - 1; i > 0 ; i--){
        			result += (str_arr[i] - '0') * carry;
        			carry *= 10;
        		}
    			result = - result;
    		}else{
    			int carry = 1;
    			for(int i = str_arr.length - 1; i >= 0 ; i--){
        			result += (str_arr[i] - '0') * carry;
        			carry *= 10;
        		}
    		}
    	}
    	return result;
    }
    public static void isValid(char[] str_arr) {
    	if(str_arr[0] == '+' || str_arr[0] == '-'){
    		for(int i = 1; i < str_arr.length; i++){
    			if(!('0' <= str_arr[i] && str_arr[i] <= '9')){
    				isValid = false;
    			}
    		}
    	}else{
    		for(int i = 0; i < str_arr.length; i++){
    			if(!('0' <= str_arr[i] && str_arr[i] <= '9')){
    				isValid = false;
    			}
    		}
    	}
    	
    }
    public static void main(String[] args) {
		String str = "-12a";
		System.out.println(StrToInt(str));
	}
}