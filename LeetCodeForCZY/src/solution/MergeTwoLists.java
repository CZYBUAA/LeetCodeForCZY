package solution;

//运行时间复杂度较差，看看进一步改善
public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = null;
		// 判空，当任何一个表为空表时，直接返回另一个链表
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		
		//设定指针
		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode pNext = null;

		// 选择第一个元素较小的那个链表作为主链表，另一个链表作插入操作
		if (p1.val <= p2.val) {
			result = p1;
			p1 = null;
		} else {
			result = p2;
			p2 = null;
		}
		ListNode pResult = result;

		// 遍历插入另一个链表
		if (p1 == null) {
			while (p2 != null) {
				//当主链表到达最后一个元素，直接接上p2剩余元素
				if(pResult.next==null) {
					pResult.next=p2;
					break;
				}
				//找到主链表中的最后一个小于p2当前元素的位置，作插入操作
				if (pResult.next.val > p2.val) {
					pNext = p2.next;			// 先标记原来p2的下一个元素的位置
					p2.next=pResult.next;		// 插入元素后段
					pResult.next = p2;			// 插入元素前段
					pResult = p2;
					p2 = pNext;
				}else {
					pResult = pResult.next;
				}
			}
		}
		//同上
		if (p2 == null) {
			while (p1 != null) {
				if(pResult.next==null) {
					pResult.next=p1;
					break;
				}
				if (pResult.next.val > p1.val) {
					pNext = p1.next;// 先标记原来p2的下一个元素的位置
					p1.next=pResult.next;// 插入元素后段
					pResult.next = p1;// 插入元素前段
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

