package com.tmy.num21;

/**
 * 合并两个有序列表(只提供解决代码，运行结果由力扣运行得出)
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/04
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //首先 定义一个虚拟的头节点，用于避免空指针的问题 p指针是去构建链表的
        ListNode dummy = new ListNode(-1) ,p = dummy;
        //定义两个分别指向链表头的指针，用于比较大小
        ListNode p1 = list1, p2 = list2;

        while (p1 != null && p2 != null){
            if(p1.val > p2.val){
                //虚拟头结点 去指向该节点
                p.next = p2;
                p2 = p2.next;
            }else {
                p.next = p1;
                p1 = p1.next;
            }
            p = p.next;
        }

        if(p1 != null){
            p.next = p1;
        }

        if (p2 != null){
            p.next = p2;
        }

        return dummy.next;
    }
}
