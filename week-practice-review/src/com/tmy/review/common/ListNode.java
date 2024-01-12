package com.tmy.review.common;

/**
 * 定义单向链表的节点
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/04
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {

    }

    public ListNode(int val){
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
