package test;

import solution.RemoveDuplicates;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		RemoveDuplicates rd=new RemoveDuplicates();
		int[] nums= {0,1,2,2,2,2,2,2,2,2,3,3,4,5,6};
		int len = rd.removeDuplicates(nums);

		// �ں������޸�����������ڵ������ǿɼ��ġ�
		// ������ĺ������صĳ���, �����ӡ�������иó��ȷ�Χ�ڵ�����Ԫ�ء�
		for (int i = 0; i < len; i++) {
		    System.out.print(nums[i]);
		}	
	}

}
