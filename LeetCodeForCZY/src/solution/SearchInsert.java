package solution;

public class SearchInsert {
	public int searchInsert(int[] nums, int target) {
        int result=-1;
        int left=0;
        int right=nums.length-1;
        int mid;
        
        while(left<=right) {
        	mid=(left+right)/2;
        	if(nums[mid]<target) {
        		left=mid+1;
        	}
        	else if(nums[mid]>target) {
        		right=mid-1;
        	}
        	else {
        		result=mid;
        		return result;
        	}
        }
        result=left;
        
        return result;
    }
}
