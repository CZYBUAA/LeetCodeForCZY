package test;

import solution.TwoSum;;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
