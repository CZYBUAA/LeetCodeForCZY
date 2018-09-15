package test;

import solution.ListNode;
import solution.MergeTwoLists;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arrays1= {1,2,4};
		int[] arrays2= {1,3,4};
		ListNode listNode1=intial(arrays1);
		ListNode listNode2=intial(arrays2);
		ListNode result=null;
		
		MergeTwoLists mtl=new MergeTwoLists();
		result=mtl.mergeTwoLists(listNode1, listNode2);
		
		ListNode p=result;
		while(p!=null){
			System.out.print(p.val);
			p=p.next;
		}
		
	}
	
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
