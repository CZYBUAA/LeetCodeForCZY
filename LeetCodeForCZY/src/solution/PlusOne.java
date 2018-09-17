package solution;

//这个方法是有问题的，当数组长度够大时，一个long都放不了数组组合表达的数字
public class PlusOne {
	public int[] plusOne(int[] digits) {

        long sum=0;
        for(int i=0,j=digits.length-1;i<digits.length;i++,j--) {
        	sum+=digits[i]*Math.pow(10, j);        	
        }
        
        sum+=1;
        long temp=1;//除数
        int digit=1;
        while(!(sum/temp>=0&&sum/temp<=9)) {
        	digit++;
        	temp*=10;
        }
        
        char[] resultChar=new char[digit];
        int[] result=new int[digit];
        Long.toString(sum).getChars(0, digit, resultChar, 0);
        for(int i=0;i<digit;i++) {
        	result[i]=Integer.valueOf(Character.toString(resultChar[i]));
        }
        
        return result;
    }
}
