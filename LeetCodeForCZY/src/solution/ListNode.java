package solution;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int x) { val = x; }
	
	//��д�ĳ��õ������ʼ������
	public static ListNode intial(int[] arrays) {
		if(arrays.length==0)
			return null;
		ListNode headNode=new ListNode(arrays[0]);
		ListNode p=headNode;
		for(int i=1;i<arrays.length;i++) {
			p.next=new ListNode(arrays[i]);
			p=p.next;
		}
		return headNode;
	}	
}


