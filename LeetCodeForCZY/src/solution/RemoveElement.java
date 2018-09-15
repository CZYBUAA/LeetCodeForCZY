package solution;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        int result=nums.length;
        
        for(int i=0;i<result;i++) {				//注意这里不能用i<nums.length作为判定条件，因为数组有效长度是一直在变化的
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
 * 在输入为[1],1时出现错误
 */
