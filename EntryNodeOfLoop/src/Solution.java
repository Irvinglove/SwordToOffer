/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
	static public ListNode MeetingNode(ListNode pHead){
		if(pHead == null){
    		return null;
    	}
		if(pHead.next != null && pHead.next.next != null){
			ListNode slow = pHead.next;
			ListNode fast = pHead.next.next;
		
		
			while(slow != fast){
				if(slow.next != null && fast.next.next != null)
				{
					slow = slow.next;
					fast = fast.next.next;
				}else{
					return null;
				}
			}
			return slow;
		}else{
			return null;
		}
	}
	
    static public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode meetingNode = MeetingNode(pHead);
        if(pHead == null || meetingNode == null){
    		return null;
    	}
        ListNode curNode = meetingNode.next;
        int NodeInLoop = 1;
        while(curNode != meetingNode){
        	NodeInLoop++;
        	curNode = curNode.next;
        }
        ListNode slow = pHead;
		ListNode fast = pHead;
        for(int i = 0; i < NodeInLoop; i++){
        	fast = fast.next;
        }
        while(fast != slow){
        	fast = fast.next;
        	slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
    	ListNode lnode0 = new ListNode(1);
		ListNode lnode1 = new ListNode(1);
		ListNode lnode2 = new ListNode(2);
		ListNode lnode3 = new ListNode(3);
		ListNode lnode4 = new ListNode(4);
		ListNode lnode5 = new ListNode(5);
		ListNode lnode6 = new ListNode(6);
		ListNode lnode7 = new ListNode(7);
		ListNode lnode8 = new ListNode(8);
		ListNode lnode9 = new ListNode(9);
		lnode1.next = lnode2;
		lnode2.next = lnode3;
		lnode3.next = lnode4;
		lnode4.next = lnode5;
		lnode5.next = lnode6;
		lnode6.next = lnode7;
		lnode7.next = lnode8;
		lnode8.next = lnode9;
		lnode9.next = lnode5;
		System.out.println(EntryNodeOfLoop(lnode0));
		
	}
}