package solution;

public class DeleteDuplicates {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode p=head;
        ListNode q;
        ListNode temp;
        
        while(p!=null){
            q=p.next;
            while(q!=null && q.val==p.val){
                temp=q;
                q=q.next;
                temp=null;
            }
            p.next=q;
            p=p.next;
        }
        return head;
    }
}
