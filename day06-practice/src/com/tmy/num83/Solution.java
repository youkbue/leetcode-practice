package com.tmy.num83;

import com.tmy.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        ListNode slow = head, fast = head;

        while (fast != null) {
            if (slow.val != fast.val) {
                slow.next = fast;
                slow = slow.next;
            }
            if (fast.next == null && slow.next != null) {
                slow.next = null;
            }
            fast = fast.next;
        }
        return head;
    }
}
