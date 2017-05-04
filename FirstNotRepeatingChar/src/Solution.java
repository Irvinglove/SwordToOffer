public class Solution {
    static public int FirstNotRepeatingChar(String str) {
    	
        int len = str.length();
        if(len == 0){
        	return -1;
        }
        char[] str_arr = str.toCharArray();
        int[] sta = new int[256];
        for(int i = 0; i < len; i++){
        	sta[str_arr[i]]++;
        }
        for(int j = 0; j < len; j++){
        	if(sta[str_arr[j]] == 1){
        		return j;
        	}
        }
    	return 0;
    }
    public static void main(String[] args) {
		String s = "abaccdeff";
		System.out.println(FirstNotRepeatingChar(s));
	}
}