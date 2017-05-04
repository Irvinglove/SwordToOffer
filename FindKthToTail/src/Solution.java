
public class Solution {
	static public ListNode FindKthToTail(ListNode head,int k) {
		ListNode first = head;
		ListNode second = head;
		if(k <= 0 || head == null){
			return null;
		}
		for(int i = 1; i < k; i++){
			if(first.next != null){
				first = first.next;
			}
			else{
				return null;
			}
		}
		while(first.next != null){
			first = first.next;
			second = second.next;
		}
		return second;
	}
    public static void main(String[] args) {
		ListNode lnode1 = new ListNode(1);
		ListNode lnode2 = new ListNode(2);
		ListNode lnode3 = new ListNode(3);
		ListNode lnode4 = new ListNode(4);
		ListNode lnode5 = new ListNode(5);
		ListNode lnode6 = new ListNode(6);
		lnode1.next = lnode2;
		lnode2.next = lnode3;
		lnode3.next = lnode4;
		lnode4.next = lnode5;
		lnode5.next = lnode6;
		System.out.println(FindKthToTail(lnode1, 7).val);
		
	}
}
