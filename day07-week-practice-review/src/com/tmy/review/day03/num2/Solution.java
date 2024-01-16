package com.tmy.review.day03.num2;

import com.tmy.review.common.ListNode;

/**
 * 求链表的中间节点(掌握)
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/12
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head ,slow = head;
        while (fast!= null &&fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
