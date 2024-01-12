package com.tmy.review.day06.num2;


import com.tmy.review.common.ListNode;

/**
 * 删除链表中的重复元素(稍微掌握)
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/12
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        ListNode fast = head ,slow = head;
        while (fast != null){
            if(slow.val != fast.val){
                slow.next = fast;
                slow = slow.next;
            }
            if(fast.next == null && slow.next != null){
                slow.next = null;
            }
            fast = fast.next;
        }
        return head;
    }
}
