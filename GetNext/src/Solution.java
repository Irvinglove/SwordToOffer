
public class Solution {
	static public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
		TreeLinkNode pNext = pNode;
		if(pNext.right != null){
			pNext = pNext.right;
			while(pNext.left != null){
				pNext = pNext.left;
			}
		}else{
			if(pNext.next == null){
				return null;
			}
			if(pNext.next.left == pNext){
				pNext = pNext.next;
			}else if(pNext.next.right == pNext){
				while(pNext.next != null && pNext.next.right == pNext){
					pNext = pNext.next;
				}
				pNext = pNext.next;
			}
		}
		return pNext;
    }
	public static void main(String[] args) {
		/*TreeLinkNode n1 = new TreeLinkNode(1);
		TreeLinkNode n2 = new TreeLinkNode(2);
		TreeLinkNode n3 = new TreeLinkNode(3);
		TreeLinkNode n4 = new TreeLinkNode(4);
		TreeLinkNode n5 = new TreeLinkNode(5);
		TreeLinkNode n6 = new TreeLinkNode(6);
		TreeLinkNode n7 = new TreeLinkNode(7);
		TreeLinkNode n8 = new TreeLinkNode(8);
		TreeLinkNode n9 = new TreeLinkNode(9);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n2.next = n1;
		n3.left = n6;
		n3.right = n7;
		n3.next = n1;
		n4.next = n2;
		n5.left = n8;
		n5.right = n9;
		n5.next = n2;
		n6.next = n3;
		n7.next = n3;
		n8.next = n5;
		n9.next = n5;*/
		TreeLinkNode n5 = new TreeLinkNode(5);
		TreeLinkNode n4 = new TreeLinkNode(4);
		TreeLinkNode n3 = new TreeLinkNode(3);
		TreeLinkNode n2 = new TreeLinkNode(2);
		n5.left = n4;
		n4.left = n3;
		n4.next = n5;
		n3.left = n2;
		n3.next = n4;
		n2.next = n3;
		System.out.println(GetNext(n5));
		
	}
}
