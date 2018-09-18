package test;

import solution.ListNode;
import solution.GetIntersectionNode;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		GetIntersectionNode gi=new GetIntersectionNode();
		int[] arraya= {1,2,5};
		int[] arrayb= {1,2,3,5,12,14,15};
		ListNode lna=ListNode.intial(arraya);
		ListNode lnb=ListNode.intial(arrayb);
		
		ListNode result=gi.getIntersectionNode(lna, lnb);
		if(result==null) {
			System.out.println("null");
		}
		else {
			while(result!=null) {
				System.out.println(result.val);
				result=result.next;
			}
		}

	}

}