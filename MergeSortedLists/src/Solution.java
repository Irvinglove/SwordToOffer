
public class Solution {
	static public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
        	return list2;
        }
        if(list2 == null){
        	return list1;
        }
        ListNode mergedNode;
        if(list1.val < list2.val){
        	mergedNode = list1;
        	mergedNode.next = Merge(list1.next, list2);
        }else{
        	mergedNode = list2;
        	mergedNode.next = Merge(list1, list2.next);
        }
        return mergedNode;
        
        
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
		System.out.println();
		
	}
}
