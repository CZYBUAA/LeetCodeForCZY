package solution;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
        int len=0;
        int i=0;//原数组区域的下标
        int j=0;//新数组区域的下标
        while(i<nums.length) {
        	int temp=nums[i];
        	nums[j]=nums[i];
        	j++;
        	//找下一个数字的下标
        	while(i<nums.length&&temp==nums[i]) {
        		i++;
        	}
        }
		return j;
    }
}
