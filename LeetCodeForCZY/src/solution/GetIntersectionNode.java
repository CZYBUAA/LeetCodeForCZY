package solution;

public class GetIntersectionNode {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode PA=headA;
        ListNode PB=headB;
        
        int a=0;//a链表的长度
        int b=0;//b链表的长度
        
        //计算A、B链表的长度
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
        
        //遍历长度长的链表，获取与短链表相同长度的起始位置
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
        
        //开始找交点
        ListNode start;
        while(PA!=null&&PB!=null) {
        	//当碰到第一个相等的值时
        	if(PA.val==PB.val) {
        		//记录起始位置
        		start=PA;
        		//检查此后的对应位置的数是否都相等
        		while(PA!=null && PB!=null &&PA.val==PB.val) {
        			PA=PA.next;
        			PB=PB.next;
        		}
        		//若为null则说明上一步的循环遍历完毕，可以返回记录的起始位置，否则继续外循环
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
