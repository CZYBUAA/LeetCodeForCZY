package solution;

public class StrStr {
	public int strStr(String haystack, String needle) {
		//�������ַ�������С�����ַ��������
		if(haystack.length()<needle.length()) {
			return -1;
		}
		//�������ַ���Ϊ���ַ������ʱ�����
		if(needle.length()==0||needle==null) {
			return 0;
		}
		//�������ַ��������ַ���������ȵ����
		if(haystack.length()==needle.length()) {
			if(haystack.equals(needle))
				return 0;
			else
				return -1;
		}
		//�����������
		for(int i=0;i<haystack.length();i++) {
			int j=0;
			int temp=i;
			//Ҫ��ָ֤�벻Խ�磬����֮ǰ����ĵط�
			while(j<needle.length()&&temp<haystack.length()) {
				//�����Ӧλ������һ���ַ���ƥ�䣬�Ƴ�ѭ��
				if(!haystack.substring(temp, temp+1).equals(needle.substring(j,j+1))) {
					break;
				}
				//��ƥ�䣬�����һ���ַ���������һ��ѭ��
				j++;
				temp++;
			}
			//��j��ֵ�����ַ����ĳ�����ȣ�˵�����ַ�������ȫ������˵���Ѿ��ҵ�ƥ������ַ���
			if(j==needle.length()) {
				return i;
			}
			
		}
        return -1;
    }
/*
 * ����Ϊ��
 * "mississippi"
 *	"issipi"
 *	ʱ����
 */
}
