package leetcode;

/**
 * 160
 * Write a program to find the node at which the intersection of two singly linked lists begins.

	For example, the following two linked lists:

	A:          a1 → a2
                   	↘
                     	c1 → c2 → c3
                   	↗            
	B:     b1 → b2 → b3

	begin to intersect at node c1.

	Notes:

    If the two linked lists have no intersection at all, return null.
    The linked lists must retain their original structure after the function returns.
    You may assume there are no cycles anywhere in the entire linked structure.
    Your code should preferably run in O(n) time and use only O(1) memory.

 * @author soft
 *
 */
public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null) {
			return null;
		}
		if(headA == headB) {
			return headA;
		}
		ListNode currentA = headA;
		ListNode currentB = headB;
		int length1 = 0;
		int length2 = 0;
		while(currentA.next != null) {
			length1 ++;
			currentA = currentA.next;
		}
		while(currentB.next != null) {
			length2 ++;
			currentB = currentB.next;
		}
		//两个链表终点不同代表不相交
		if(currentA != currentB) {
			return null;
		}
		int diff = 0;
		currentA = headA;
		currentB = headB;
		//让2个链表的长度相同
		if(length1 >= length2) {
			diff = length1 - length2;
			while(diff != 0) {
				currentA = currentA.next;
				diff --;
			}
		} else {
			diff = length2 - length1;
			while(diff != 0) {
				currentB = currentB.next;
				diff --;
			}
		}
		while(currentA != currentB) {
			currentA = currentA.next;
			currentB = currentB.next;
		}
		return currentA;
	}
}
