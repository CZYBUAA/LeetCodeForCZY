package test;

import solution.SearchInsert;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		SearchInsert si=new SearchInsert();
		int[] nums= {1};
		int target=0;
		int result=si.searchInsert(nums, target);
		
		System.out.println(result);
	}

}