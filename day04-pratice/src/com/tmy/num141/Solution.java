package com.tmy.num141;

import com.tmy.ListNode;

/**
 * 解决方案
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/09
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head , slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
