import java.util.Stack;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    /*static public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	if(pHead1 == null || pHead2 == null){
    		return null;
    	}
    	Stack<ListNode> stack1 = new Stack<ListNode>();
    	Stack<ListNode> stack2 = new Stack<ListNode>();
    	ListNode l1 = pHead1;
    	ListNode l2 = pHead2;
    	ListNode result = null;
    	while(l1 != null){
    		stack1.add(l1);
    		l1 = l1.next;
    	}
    	while(l2 != null){
    		stack2.add(l2);
    		l2 = l2.next;
    	}
    	while(stack1.peek() == stack2.peek()){
    		result = stack1.pop();
    		stack2.pop();
    	}
    	return result;
    }*/
	static public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	if(pHead1 == null || pHead2 == null){
    		return null;
    	}
    	
    	ListNode l1 = pHead1;
    	ListNode l2 = pHead2;
    	int l1_count = 0;
    	int l2_count = 0;
    	ListNode result = null;
    	while(l1 != null){
    		l1_count++;
    		l1 = l1.next;
    	}
    	while(l2 != null){
    		l2_count++;
    		l2 = l2.next;
    	}
    	if(l1_count > l2_count){
    		int minus = l1_count - l2_count; 
    		while(minus-- > 0){
    			pHead1 = pHead1.next;
    		}
    	}else{
    		int minus = l2_count - l1_count; 
    		while(minus-- > 0){
    			pHead2 = pHead2.next;
    		}
    	}
    	while(pHead1 != pHead2){
    		pHead1 = pHead1.next;
    		pHead2 = pHead2.next;
    	}
    	return pHead1;
    }
    public static void main(String[] args) {
		ListNode lnode1 = new ListNode(1);
		ListNode lnode2 = new ListNode(2);
		ListNode lnode3 = new ListNode(3);
		ListNode lnode4 = new ListNode(4);
		ListNode lnode5 = new ListNode(5);
		ListNode lnode6 = new ListNode(6);
		ListNode lnode7 = new ListNode(7);
		lnode1.next = lnode2;
		lnode2.next = lnode3;
		lnode3.next = lnode6;
		lnode4.next = lnode5;
		lnode5.next = lnode6;
		lnode6.next = lnode7;
		System.out.println(FindFirstCommonNode(lnode1, lnode4).val);
		
	}
}