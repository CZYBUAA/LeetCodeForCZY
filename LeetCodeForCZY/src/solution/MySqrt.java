package solution;

public class MySqrt {
	public int mySqrt(int x) {
        int i=0;
		while(i*i<=x) {
			if(i*i==x) {
				return i;
			}
			i++;
		}
		return i-1;
    }
	
	//����Ϊ2147483647ʱ��������ʱ������
}
