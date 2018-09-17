package solution;


//时间太慢，解答中的典型案例就很好，还可以做修改
public class PlusOne {
	public int[] plusOne(int[] digits) {
		//更好的解法
		/*
		int len = digits.length;

        for (int j = len - 1; j >= 0; j--) {
            if (digits[j] != 9) {
                digits[j]++;
                return digits;
            }
            digits[j] = 0;
        }

        int[] newDigits = new int[len + 1];
        newDigits[0] = 1;
        return newDigits;
		*/
        
        //更改过后的解法
		int[] result=null;
        boolean plusFlag=false;//判断是否向高位进一
        boolean currentPlusFlag=false;//判断当前位是否加一
        
        if(digits[digits.length-1]!=9) {
        	digits[digits.length-1]++;
        	return digits;
        }else {
        	plusFlag=true;		//若等于9则说明初始时需要向高位进1
        }
        
        
        for(int i=digits.length-1;i>=0;i--) {
        	//进位判断交换，若低位向本位进1，则当前位加一控制符设置为真，进位符设置为假
        	if(plusFlag==true) {
        		currentPlusFlag=true;
        		plusFlag=false;
        	}
        	
        	//计算各值
        	if(currentPlusFlag==true) {
            	if(digits[i]==9) {
            		plusFlag=true;
            		
            		digits[i]=0;
            		currentPlusFlag=false;
            		//判断最高位情况，根据需要增加数组元素
            		if(i==0) {
            			result=new int[digits.length+1];
            			result[0]=1;
            			return result;
            		}
            	}else {
            		digits[i]++;
            		return digits;
            	}
            }else {
            	continue;
            }	
        }
        return digits;
    }
}
