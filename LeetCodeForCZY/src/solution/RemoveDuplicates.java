package solution;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
        int len=0;
        int i=0;//ԭ����������±�
        int j=0;//������������±�
        while(i<nums.length) {
        	int temp=nums[i];
        	nums[j]=nums[i];
        	j++;
        	//����һ�����ֵ��±�
        	while(i<nums.length&&temp==nums[i]) {
        		i++;
        	}
        }
		return j;
    }
}
