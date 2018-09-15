package solution;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length==0) {
			return "";
		}
		//获取字符串中最小长度
		int min=strs[0].length();
		for(int i=0;i<strs.length;i++) {
			if(strs[i].length()<min)
				min=strs[i].length();
		}
		
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<min;i++) {
			String temp=strs[0].substring(i, i+1);
			for(int j=0;j<strs.length;j++) {
				if(!strs[j].substring(i, i+1).equals(temp)){
					return result.toString();
				}
			}
			result.append(temp);
		}
        return result.toString();
    }
}
