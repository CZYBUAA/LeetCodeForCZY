package test;

import solution.ListNode;
import solution.DeleteDuplicates;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		DeleteDuplicates dd=new DeleteDuplicates();
		int[] arrayb= {1,2,2,2,2,14,15};
		ListNode lnb=ListNode.intial(arrayb);
		
		ListNode result=dd.deleteDuplicates(lnb);
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