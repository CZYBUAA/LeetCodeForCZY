package test;

import solution.PlusOne;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		PlusOne po=new PlusOne();
		int[] nums= {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
		int[] result=po.plusOne(nums);
		
		for(int i:result) {
			System.out.print(i);
		}
		
	}

}