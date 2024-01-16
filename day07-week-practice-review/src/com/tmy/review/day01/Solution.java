package com.tmy.review.day01;

import com.tmy.review.common.ListNode;

/**
 * 题号21 合并两个有序链表(掌握)
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/12
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1) , p = dummy;

        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                p.next = list1;
                p = p.next;
                list1 = list1.next;
            }else {
                p.next = list2;
                p = p.next;
                list2 = list2.next;
            }
        }

        if(list1 != null){
            p.next = list1;
        }
        if(list2 != null){
            p.next = list2;
        }
        return dummy.next;
    }
}
