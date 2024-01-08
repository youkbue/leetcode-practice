package com.tmy.num876;

import com.tmy.ListNode;

/**
 * 求链表的中间节点
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/08
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head , fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
