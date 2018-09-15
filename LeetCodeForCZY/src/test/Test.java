package test;

import solution.LongestCommonPrefix;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		LongestCommonPrefix longestCommonPrefix_test=new LongestCommonPrefix();
		String[] strs= {"flower","flow","flight"};
		String result=longestCommonPrefix_test.longestCommonPrefix(strs);
		System.out.print(result);
	}

}
