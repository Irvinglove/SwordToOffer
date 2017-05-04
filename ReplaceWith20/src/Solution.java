public class Solution {
    static public String replaceSpace(StringBuffer str) {
    	String result = str.toString().replace(" ", "%20");
        return result;
    }
    public static void main(String[] args) {
    	StringBuffer str = new StringBuffer("la la ");
		System.out.println(replaceSpace(str));
	}
}