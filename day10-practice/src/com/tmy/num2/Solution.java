package com.tmy.num2;

import com.tmy.ListNode;

/**
 * 两数相加
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/18
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0) ;
        ListNode p = l1, q = l2,current = dummyHead;
        int carry = 0;
        while (p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum /10;
            current.next = new ListNode(sum % 10);
            if(p != null){
                p = p.next;
            }
            if(q != null){
                q = q.next;
            }
            current = current.next;
            if(carry > 0){
                current.next = new ListNode(carry);
            }
        }

        return dummyHead.next;
    }
}
