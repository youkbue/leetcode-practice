package com.tmy.num142;

import com.tmy.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head , slow = head;

        //同理还是先判断是否存在环
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)break;
        }
        //无环
        if(fast == null || fast.next == null){
            return null;
        }
        //有环 此时 fast和slow在同一个地方
        slow = head;
        //slow 指向头指针 fast继续走 如果再相遇说明就是环起点位置
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
