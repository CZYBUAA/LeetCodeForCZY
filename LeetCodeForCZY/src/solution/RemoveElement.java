package solution;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        int result=nums.length;
        
        for(int i=0;i<result;i++) {				//ע�����ﲻ����i<nums.length��Ϊ�ж���������Ϊ������Ч������һֱ�ڱ仯��
        	if(nums[i]==val) {
        		while(result>0&&nums[result-1]==val) {
        			result--;
        		}
        		if(i<result) {
        			nums[i]=nums[result-1];
            		result--;
        		}
        	}
        }
        return result;
    }
}

/*
 * ������Ϊ[1],1ʱ���ִ���
 */
