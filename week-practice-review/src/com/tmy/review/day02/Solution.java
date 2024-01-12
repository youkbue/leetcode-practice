package com.tmy.review.day02;

import com.tmy.review.common.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 题号23 合并k个有序链表(较为掌握)
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/12
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        ListNode dummy = new ListNode(-1) ,p = dummy;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(3,
                new Comparator<ListNode>() {
                    @Override
                    public int compare(ListNode o1, ListNode o2) {
                        return o1.val - o2.val;
                    }
                }
        );
        //遍历头结点
        for (ListNode node : lists) {
            if(node != null){
                priorityQueue.add(node);
            }
        }
        while (!priorityQueue.isEmpty()){
            ListNode poll = priorityQueue.poll();
            p.next = poll;
            if(poll.next != null){
                priorityQueue.add(poll.next);
            }
            p = p.next;
        }
        return dummy.next;
    }
}
