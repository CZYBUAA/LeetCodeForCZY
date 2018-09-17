package solution;

public class MySqrt {
	public int mySqrt(int x) {
		//牛顿迭代法!!!!
		if (x < 0)
            return -1;
		if (x == 0)
            return 0;
        long r = x;
        //当r^2>x的时候不断迭代，r^2=x的时候迭代结束，求得最终的解（按理说，r的最小值是x的开方，但是由于程序中有截断小数的情况，因此会出现r^2<x的情况）
        //这里有个疑问，终止条件不应该是以误差控制为判断依据吗？
        while (r * r > x) {
        	r = (r + x / r) / 2;
            System.out.println(r);
        } 
        return (int) r;
    }
	
	
}
