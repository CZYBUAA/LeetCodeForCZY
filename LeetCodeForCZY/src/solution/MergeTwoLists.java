package solution;

//����ʱ�临�ӶȽϲ������һ������
public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = null;
		// �пգ����κ�һ����Ϊ�ձ�ʱ��ֱ�ӷ�����һ������
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		
		//�趨ָ��
		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode pNext = null;

		// ѡ���һ��Ԫ�ؽ�С���Ǹ�������Ϊ��������һ���������������
		if (p1.val <= p2.val) {
			result = p1;
			p1 = null;
		} else {
			result = p2;
			p2 = null;
		}
		ListNode pResult = result;

		// ����������һ������
		if (p1 == null) {
			while (p2 != null) {
				//�������������һ��Ԫ�أ�ֱ�ӽ���p2ʣ��Ԫ��
				if(pResult.next==null) {
					pResult.next=p2;
					break;
				}
				//�ҵ��������е����һ��С��p2��ǰԪ�ص�λ�ã����������
				if (pResult.next.val > p2.val) {
					pNext = p2.next;			// �ȱ��ԭ��p2����һ��Ԫ�ص�λ��
					p2.next=pResult.next;		// ����Ԫ�غ��
					pResult.next = p2;			// ����Ԫ��ǰ��
					pResult = p2;
					p2 = pNext;
				}else {
					pResult = pResult.next;
				}
			}
		}
		//ͬ��
		if (p2 == null) {
			while (p1 != null) {
				if(pResult.next==null) {
					pResult.next=p1;
					break;
				}
				if (pResult.next.val > p1.val) {
					pNext = p1.next;// �ȱ��ԭ��p2����һ��Ԫ�ص�λ��
					p1.next=pResult.next;// ����Ԫ�غ��
					pResult.next = p1;// ����Ԫ��ǰ��
					pResult = p1;
					p1 = pNext;
				}else {
					pResult = pResult.next;
				}
			}
		}

		return result;
	}
}

