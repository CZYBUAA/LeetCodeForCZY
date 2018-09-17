package solution;


//时间太慢，解答中的典型案例就很好，还可以做修改
public class PlusOne {
	public int[] plusOne(int[] digits) {
        int[] result=null;
        boolean plusFlag=false;//判断是否向高位进一
        boolean currentPlusFlag=false;//判断当前位是否加一
        
        if(digits[digits.length-1]!=9) {
        	digits[digits.length-1]++;
        	return digits;
        }else {
        	plusFlag=true;
        }
        
        
        for(int i=digits.length-1;i>=0;i--) {
        	if(plusFlag==true) {
        		currentPlusFlag=true;
        		plusFlag=false;
        	}
        	
        	//判断各位是否会产生进位
        	if(currentPlusFlag==true) {
            	if(digits[i]==9) {
            		plusFlag=true;
            		
            		digits[i]=0;
            		currentPlusFlag=false;
            		//判断最高位情况
            		if(i==0) {
            			result=new int[digits.length+1];
            			result[0]=1;
            			for(int j=1;j<digits.length+1;j++) {
            				result[j]=digits[j-1];
            				return result;
            			}
            		}
            	}else {
            		digits[i]++;
            		plusFlag=false;
            		currentPlusFlag=false;
            	}
            }else {
            	continue;
            }
        	//按照进位判断情况，计算各位的运算结果
        	if(digits[i]==9 && plusFlag==true) {
        		
        	}
        	
        }
        return digits;
    }
}
