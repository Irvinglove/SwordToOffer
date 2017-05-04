package printListFromTailToHead;

/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    static public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	ArrayList<Integer> arr = new ArrayList<Integer>();
        if(listNode == null){
        	return arr;
        }
        Stack<Integer> stk = new Stack<Integer>();
        while(listNode != null){
        	stk.push(listNode.val);
        	listNode = listNode.next;
        }
        while(!stk.isEmpty()){
        	arr.add(stk.pop());
        }
        return arr;
    }
    public static void main(String[] args) {
		ListNode lnode1 = new ListNode(1);
		ListNode lnode2 = new ListNode(2);
		ListNode lnode3 = new ListNode(3);
		lnode1.next = lnode2;
		lnode2.next = lnode3;
		System.out.println(printListFromTailToHead(lnode1));
		
	}
}