
import java.util.Stack;
 
/*思路：用一个栈data保存数据，用另外一个栈min保存依次入栈最小的数
比如，data中依次入栈，5,  4,  3, 8, 10, 11, 12, 1
       则min依次入栈，5,  4,  3，no,no, no, no, 1
 
no代表此次不如栈
每次入栈的时候，如果入栈的元素比min中的栈顶元素小或等于则入栈，否则不如栈。
 */
public class Solution {
	static Stack<Integer> data = new Stack<Integer>();
	static Stack<Integer> min = new Stack<Integer>();
    static public void push(int node) {
       data.add(node);
       if(min.isEmpty()){
    	   min.add(node);
       }else if(min.peek() > node){
    	   min.add(node);
       }else{
    	   min.add(min.peek());
       }
    }
     
    static public void pop() {
    	if(data.size() > 0 && min.size() > 0){
	        data.pop();
	        min.pop();
    	}
    }
     
    static public int top() {
        return data.peek();
    }
     
    static public int min() {
    	System.out.println(min.peek());
        return min.peek();
    }
    public static void main(String[] args) {
		push(3);
		min();
		push(4);
		min();
		push(2);
		min();
		push(3);
		min();
	}
}