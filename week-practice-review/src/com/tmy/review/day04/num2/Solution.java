package com.tmy.review.day04.num2;

import com.tmy.review.common.ListNode;

/**
 * 求链表环的起点(掌握不牢固)
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/12
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head ,slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                break;
            }
        }
        if (slow != fast){
            return null;
        }
        slow = head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
