package solution;


//ʱ��̫��������еĵ��Ͱ����ͺܺã����������޸�
public class PlusOne {
	public int[] plusOne(int[] digits) {
        int[] result=null;
        boolean plusFlag=false;//�ж��Ƿ����λ��һ
        boolean currentPlusFlag=false;//�жϵ�ǰλ�Ƿ��һ
        
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
        	
        	//�жϸ�λ�Ƿ�������λ
        	if(currentPlusFlag==true) {
            	if(digits[i]==9) {
            		plusFlag=true;
            		
            		digits[i]=0;
            		currentPlusFlag=false;
            		//�ж����λ���
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
        	//���ս�λ�ж�����������λ��������
        	if(digits[i]==9 && plusFlag==true) {
        		
        	}
        	
        }
        return digits;
    }
}
