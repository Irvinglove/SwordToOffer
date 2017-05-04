
public class Solution {
	 static public RandomListNode Clone(RandomListNode pHead){
		 CloneNode(pHead);
		 ConnectNode(pHead);
		 return DetatchNode(pHead);
	 }
	 
	 static public void CloneNode(RandomListNode pHead){
		 RandomListNode curNode = pHead;
	     while(curNode != null){
	    	 RandomListNode newNode = new RandomListNode(curNode.val);
	    	 newNode.next = curNode.next;
	    	 curNode.next = newNode;
	    	 curNode = newNode.next;
	     }
	 }
	 
	 static public void ConnectNode(RandomListNode pHead){
		 RandomListNode curNode = pHead;
	     while(curNode != null){
	    	 if(curNode.random != null){
		    	 curNode.next.random = curNode.random.next;
	    	 }else{
	    		 curNode.next.random = null;
	    	 }
	    	 curNode = curNode.next.next;
	     }
	 }
	 
	 static public RandomListNode DetatchNode(RandomListNode pHead){
		 RandomListNode newHead = pHead.next;
		 RandomListNode newNode = pHead.next;
		 RandomListNode curNode = newNode.next;
		 
	     while(curNode != null){
	    	 newNode.next = curNode.next;
	    	 newNode = newNode.next;
	    	 curNode.next = newNode.next;
	    	 curNode = curNode.next;
	     }
	     return newHead;
	 }
	 
	 public static void main(String[] args) {
		RandomListNode lnode1 = new RandomListNode(1);
		RandomListNode lnode2 = new RandomListNode(2);
		RandomListNode lnode3 = new RandomListNode(3);
		RandomListNode lnode4 = new RandomListNode(4);
		RandomListNode lnode5 = new RandomListNode(5);
		lnode1.next = lnode2;
		lnode1.random = lnode3;
		lnode2.next = lnode3;
		lnode2.random = lnode5;
		lnode3.next = lnode4;
		lnode4.next = lnode5;
		lnode4.random = lnode2;
		RandomListNode curnode = lnode1;
		RandomListNode newHead = Clone(curnode);
		while(newHead != null){
			if(newHead.random != null)
				System.out.println(newHead.random.val);
			else
				System.out.println("#");
			newHead = newHead.next;
		}
	}
}
