package com.tmy.review.day03.num1;

import com.tmy.review.common.ListNode;

/**
 * 删除链表的倒数第n个(较为掌握 注意考虑 删除第一个元素 所以应当引入一个虚拟节点)
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/12
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prefixNode = findReciprocalNode(dummy, n + 1);
        prefixNode.next = prefixNode.next.next;
        return dummy.next;
    }

    private ListNode findReciprocalNode(ListNode head,int n){
        //将倒数几个转化为正数 公式 l - n + 1(n为倒数第几个 l为链表长度)
        ListNode fast = head ,slow = head;
        for (int i = 0 ; i < n ;i++){
            fast = fast.next;
        }
        //然后快慢指针一起移动
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
