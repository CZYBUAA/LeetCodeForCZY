package solution;


//ʱ��̫��������еĵ��Ͱ����ͺܺã����������޸�
public class PlusOne {
	public int[] plusOne(int[] digits) {
		//���õĽⷨ
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
        
        //���Ĺ���Ľⷨ
		int[] result=null;
        boolean plusFlag=false;//�ж��Ƿ����λ��һ
        boolean currentPlusFlag=false;//�жϵ�ǰλ�Ƿ��һ
        
        if(digits[digits.length-1]!=9) {
        	digits[digits.length-1]++;
        	return digits;
        }else {
        	plusFlag=true;		//������9��˵����ʼʱ��Ҫ���λ��1
        }
        
        
        for(int i=digits.length-1;i>=0;i--) {
        	//��λ�жϽ���������λ��λ��1����ǰλ��һ���Ʒ�����Ϊ�棬��λ������Ϊ��
        	if(plusFlag==true) {
        		currentPlusFlag=true;
        		plusFlag=false;
        	}
        	
        	//�����ֵ
        	if(currentPlusFlag==true) {
            	if(digits[i]==9) {
            		plusFlag=true;
            		
            		digits[i]=0;
            		currentPlusFlag=false;
            		//�ж����λ�����������Ҫ��������Ԫ��
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
