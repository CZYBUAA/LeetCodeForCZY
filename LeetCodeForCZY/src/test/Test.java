package test;

import solution.StrStr;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		StrStr ss=new StrStr();
		String haystack="mississippi";
		String needle="issipi";
		int result=ss.strStr(haystack, needle);
		System.out.print(result);	
	}

}
