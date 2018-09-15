package test;

import solution.RemoveElement;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RemoveElement re=new RemoveElement();
		int[] nums= {2,0,1,2,4,2,2};
		int vals=2;
		int len = re.removeElement(nums, vals);

		for (int i = 0; i < len; i++) {
		    System.out.print(nums[i]);
		}	
	}

}
