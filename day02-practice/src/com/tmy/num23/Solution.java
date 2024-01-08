package com.tmy.num23;


import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 合并k个有序列表(只提供解决代码，运行结果由力扣运行得出)
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/07
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        //链表相关 的通用代码 p负责去构建链表
        ListNode dump = new ListNode(-1), p = dump;
        //创建 一个 优先级 队列 数字越小 优先级越高
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                //如果返回的是负数 则 o1 排在 02的前面 即按升序排列
                return o1.val - o2.val;
            }
        });

        //将 k 个链表中的头节点 存进 该优先级队列
        for (ListNode listNode : lists) {
            if(listNode != null) {
                priorityQueue.add(listNode);
            }
        }

        // 依次弹出 优先级高的节点
        while (!priorityQueue.isEmpty()) {
            ListNode poll = priorityQueue.poll();
            p.next = poll;
            if(poll.next != null){
                priorityQueue.add(poll.next);
            }
            p = p.next;
        }

        return dump.next;
    }


}
