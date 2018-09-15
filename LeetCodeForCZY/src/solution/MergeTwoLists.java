package solution;

public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = null;
		// 判空
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

		// 初始化第一个结点（因为是不带头节点的链表）
		if (p1.val <= p2.val) {
			result = p1;
			p1 = null;
		} else {
			result = p2;
			p2 = null;
		}
		ListNode pResult = result;

		// 判空，做剩余处理
		if (p1 == null) {
			while (p2 != null) {
				if (pResult.val <= p2.val) {
					p2Next = p2.next;// 先标记原来p2的下一个元素的位置
					p2.next=pResult.next;// 插入元素后段
					pResult.next = p2;// 插入元素前段
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
					p1Next = p1.next;// 先标记原来p2的下一个元素的位置
					p1.next=pResult.next;// 插入元素后段
					pResult.next = p1;// 插入元素前段
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