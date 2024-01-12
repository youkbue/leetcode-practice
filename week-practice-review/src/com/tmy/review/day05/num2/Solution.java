package com.tmy.review.day05.num2;


import com.tmy.review.common.ListNode;


/**
 * 判断两个链表是否相交 （掌握不牢固）
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/12
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA , p2 = headB;
        while (p1 != p2) {
            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }
        return p1;
    }

}
