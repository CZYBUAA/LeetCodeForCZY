package solution;

public class StrStr {
	public int strStr(String haystack, String needle) {
		//处理主字符串长度小于子字符串的情况
		if(haystack.length()<needle.length()) {
			return -1;
		}
		//处理子字符串为空字符串或空时的情况
		if(needle.length()==0||needle==null) {
			return 0;
		}
		//处理主字符串和子字符串长度相等的情况
		if(haystack.length()==needle.length()) {
			if(haystack.equals(needle))
				return 0;
			else
				return -1;
		}
		//处理正常情况
		for(int i=0;i<haystack.length();i++) {
			int j=0;
			int temp=i;
			//要保证指针不越界，这是之前犯错的地方
			while(j<needle.length()&&temp<haystack.length()) {
				//如果对应位置任意一个字符不匹配，推出循环
				if(!haystack.substring(temp, temp+1).equals(needle.substring(j,j+1))) {
					break;
				}
				//若匹配，检查下一个字符，进入下一轮循环
				j++;
				temp++;
			}
			//若j的值与子字符串的长度相等，说明子字符串被完全遍历，说明已经找到匹配的子字符串
			if(j==needle.length()) {
				return i;
			}
			
		}
        return -1;
    }
/*
 * 输入为：
 * "mississippi"
 *	"issipi"
 *	时出错
 */
}
