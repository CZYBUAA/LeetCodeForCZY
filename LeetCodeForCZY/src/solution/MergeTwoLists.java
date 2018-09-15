package solution;

public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = null;
		// �п�
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode p1Next = null;
		ListNode p2Next = null;

		// ��ʼ����һ����㣨��Ϊ�ǲ���ͷ�ڵ������
		if (p1.val <= p2.val) {
			result = p1;
			p1 = null;
		} else {
			result = p2;
			p2 = null;
		}
		ListNode pResult = result;

		// �пգ���ʣ�ദ��
		if (p1 == null) {
			while (p2 != null) {
				if (pResult.val <= p2.val) {
					p2Next = p2.next;// �ȱ��ԭ��p2����һ��Ԫ�ص�λ��
					p2.next=pResult.next;// ����Ԫ�غ��
					pResult.next = p2;// ����Ԫ��ǰ��
					pResult = p2.next;
					p2 = p2Next;
				}else {
					pResult = pResult.next;
				}
			}
		}
		if (p2 == null) {
			while (p1 != null) {
				if (pResult.val <= p1.val) {
					p1Next = p1.next;// �ȱ��ԭ��p2����һ��Ԫ�ص�λ��
					p1.next=pResult.next;// ����Ԫ�غ��
					pResult.next = p1;// ����Ԫ��ǰ��
					pResult = p1.next;
					p1 = p1Next;
				}else {
					pResult = pResult.next;
				}
			}
		}

		return result;
	}
}