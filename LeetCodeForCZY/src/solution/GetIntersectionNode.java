package solution;

public class GetIntersectionNode {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode PA=headA;
        ListNode PB=headB;
        
        int a=0;//a����ĳ���
        int b=0;//b����ĳ���
        
        //����A��B����ĳ���
        while(PA!=null) {
        	PA=PA.next;
        	a++;
        }
        
        while(PB!=null) {
        	PB=PB.next;
        	b++;
        }
        
        PA=headA;
        PB=headB;
        
        //�������ȳ���������ȡ���������ͬ���ȵ���ʼλ��
        if(a>b) {
        	while(a>b) {
        		PA=PA.next;
        		a--;
        	}
        }else if(a<b) {
        	while(a<b) {
        		PB=PB.next;
        		b--;
        	}
        }
        
        //��ʼ�ҽ���
        ListNode start;
        while(PA!=null&&PB!=null) {
        	//��������һ����ȵ�ֵʱ
        	if(PA.val==PB.val) {
        		//��¼��ʼλ��
        		start=PA;
        		//���˺�Ķ�Ӧλ�õ����Ƿ����
        		while(PA!=null && PB!=null &&PA.val==PB.val) {
        			PA=PA.next;
        			PB=PB.next;
        		}
        		//��Ϊnull��˵����һ����ѭ��������ϣ����Է��ؼ�¼����ʼλ�ã����������ѭ��
        		if(PA!=null && PB!=null)
        			continue;
        		else
        			return start;
        	}
        	PA=PA.next;
        	PB=PB.next;
        }
        return null;
    }
}
