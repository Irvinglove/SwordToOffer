package deleteDuplication;

public class Solution {
	 static public ListNode deleteDuplication(ListNode pHead)
	 {
		 if(pHead == null || pHead.next == null){
			 return pHead;
		 }
		 //头部是否需要删除
		 while(pHead != null && pHead.next != null &&  pHead.val == pHead.next.val){
			 while(pHead.next != null &&  pHead.val == pHead.next.val){
				 pHead = pHead.next;
			 }
			 pHead = pHead.next;
		 }
		 if(pHead == null){
			 return null;
		 }
		 ListNode pNode = pHead.next;
		 ListNode preNode = pHead;
		 while(pNode != null){
			 if(pNode.next == null){
				 preNode.next = pNode;
				 break;
			 }
			 if(pNode.val == pNode.next.val){
				 while(pNode.next != null && pNode.val == pNode.next.val){
					 pNode = pNode.next;
				 }
				 pNode = pNode.next;
				 if(pNode == null){
					 preNode.next = pNode;
				 }
			 }else{
				 preNode.next = pNode;
				 preNode = pNode;
				 pNode = pNode.next;
			 }
		 }
		 return pHead;
	 }
	 public static void main(String[] args) {
		 	ListNode lnode0 = null;
			ListNode lnode1 = new ListNode(1);
			ListNode lnode2 = new ListNode(1);
			ListNode lnode3 = new ListNode(2);
			ListNode lnode4 = new ListNode(3);
			ListNode lnode5 = new ListNode(4);
			ListNode lnode6 = new ListNode(4);
			ListNode lnode7 = new ListNode(5);
			lnode1.next = lnode2;
			lnode2.next = lnode3;
			lnode3.next = lnode4;
			lnode4.next = lnode5;
			lnode5.next = lnode6;
			lnode6.next = lnode7;
			ListNode pHead = deleteDuplication(lnode1);
			
			while(pHead != null){
				System.out.println(pHead.val);
				pHead = pHead.next;
			}
			
	}
}
