package solution;
/*
 *曾经遇到的错误：
 * nums=[3,-3],target=0
 * nums=[3,3],target=6
 * nums=[3,2,4],target=6
 */

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];

		// 先对数组nums进行排序
		int[] sortNums = sort(nums);
		for (int t : sortNums) {
			System.out.println(t);
		}
		// 获取小于target值的最大下标
		//int i = 0;
		//for (; i < sortNums.length && sortNums[i] <= target; i++)
		//	continue;
		int maxIndex = nums.length - 1;
		// 从左右向中间获取数值
		if (maxIndex <= 0) {
			return null;
		}
		for (int j = 0; j <= maxIndex; j++) {
			int result_A = sortNums[j];
			int result_B = target - sortNums[j];
			for (int k = maxIndex; k > j; k--) {
				if (sortNums[k] == result_B) {
					result[0] = getIndexFromLeft(result_A, nums);
					result[1] = getIndexFromRight(result_B, nums);
					return result;
				}
			}
		}

		return null;
	}

	public int[] sort(int[] nums) {
		int temp = 0;
		int[] sortNums = nums.clone();
		for (int i = 0; i < sortNums.length; i++) {
			int min = sortNums[i];
			int minIndex = i;
			for (int j = i + 1; j < sortNums.length; j++) {
				if (min > sortNums[j]) {
					minIndex = j;
					min = sortNums[j];
				}
			}
			if (minIndex != i) {
				temp = min;
				sortNums[minIndex] = sortNums[i];
				sortNums[i] = temp;
			}
		}
		return sortNums;
	}

	public int getIndexFromLeft(int number, int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == number) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int getIndexFromRight(int number, int[] nums) {
		int index = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == number) {
				index = i;
				break;
			}
		}
		return index;
	}
}
