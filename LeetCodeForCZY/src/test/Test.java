package test;

import solution.RemoveElement;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		RemoveElement re=new RemoveElement();
		int[] nums= {2};
		int vals=2;
		int len = re.removeElement(nums, vals);

		for (int i = 0; i < len; i++) {
		    System.out.print(nums[i]);
		}	
	}

}
