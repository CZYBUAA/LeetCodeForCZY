package test;

import solution.TwoSum;;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] nums = {3,-3};
		int target = 0;
		TwoSum twoSumtest=new TwoSum();
		int[] result=twoSumtest.twoSum(nums, target);
		System.out.println(result);
		for(int i:result) {
			System.out.println(i);
		}
	}

}
