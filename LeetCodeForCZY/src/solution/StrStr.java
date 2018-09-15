package solution;

public class StrStr {
	public int strStr(String haystack, String needle) {
		if(haystack.length()<needle.length()) {
			return -1;
		}
		if(needle.length()==0||needle==null) {
			return 0;
		}
		if(haystack.length()==needle.length()) {
			if(haystack.equals(needle))
				return 0;
			else
				return -1;
		}
		
		for(int i=0;i<haystack.length();i++) {
			int j=0;
			int temp=i;
			while(j<needle.length()) {
				if(!haystack.substring(temp, temp+1).equals(needle.substring(j,j+1))) {
					break;
				}
				j++;
				temp++;
			}
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
