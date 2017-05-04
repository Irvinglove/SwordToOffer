import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
	/*static public int MoreThanHalfNum_Solution(int [] array) {
		int[] result = new int[Integer.MAX_VALUE];
		for(int i = 0; i < array.length; i++){
			result[array[i]]++;
		}
		for(int i = 0; i < array.length; i++){
			if(result[array[i]] > array.length >> 1){
				return array[i];
			}
		}
		return 0;
	}*/
	static public int MoreThanHalfNum_Solution(int [] array) {
		HashMap<Integer, Integer> hash = new HashMap<>();
		for(int i = 0; i < array.length; i++){
			if(hash.containsKey(array[i])){
				int value = hash.get(array[i]);
				value++;
				hash.put(array[i], value);
			}else{
				hash.put(array[i], 1);
			}
		}
		Iterator iter = hash.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			int val = (int) entry.getValue();
			int key = (int) entry.getKey();
			if(val > array.length >> 1){
				return key;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,2,2,2,5,4,2};
		System.out.println(MoreThanHalfNum_Solution(arr));
	}
}
