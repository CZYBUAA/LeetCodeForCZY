package test;

import solution.RemoveDuplicates;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RemoveDuplicates rd=new RemoveDuplicates();
		int[] nums= {0,1,2,2,2,2,2,2,2,2,3,3,4,5,6};
		int len = rd.removeDuplicates(nums);

		// 在函数里修改输入数组对于调用者是可见的。
		// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
		for (int i = 0; i < len; i++) {
		    System.out.print(nums[i]);
		}	
	}

}
