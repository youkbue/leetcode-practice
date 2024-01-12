package com.tmy.review.day04.num1;

import com.tmy.review.common.ListNode;

/**
 * 查找链表是否具有环(掌握)
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/12
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head,slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
