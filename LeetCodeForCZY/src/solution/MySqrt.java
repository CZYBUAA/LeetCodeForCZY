package solution;

public class MySqrt {
	public int mySqrt(int x) {
		//ţ�ٵ�����!!!!
		if (x < 0)
            return -1;
		if (x == 0)
            return 0;
        long r = x;
        //��r^2>x��ʱ�򲻶ϵ�����r^2=x��ʱ�����������������յĽ⣨����˵��r����Сֵ��x�Ŀ������������ڳ������нض�С�����������˻����r^2<x�������
        //�����и����ʣ���ֹ������Ӧ������������Ϊ�ж�������
        while (r * r > x) {
        	r = (r + x / r) / 2;
            System.out.println(r);
        } 
        return (int) r;
    }
	
	
}
