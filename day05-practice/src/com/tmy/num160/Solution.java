package com.tmy.num160;

import com.tmy.ListNode;

import java.util.HashSet;

/**
 * 解决方案
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/10
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        return dealMethod2(headA, headB);
    }

    /**
     * 解决方法 1 采用set的方式 将一个链表存进set
     * 然后遍历另外一个链表 ，如果存在相同的元素 则说明他们相交
     *
     * @param headA 海达
     * @param headB 头带
     * @return {@link ListNode}
     */
    public ListNode dealMethod1(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        for (ListNode p = headA; p != null; p = p.next) {
            set.add(p);
        }
        for (ListNode p = headB; p != null; p = p.next) {
            if (set.contains(p)) {
                return p;
            }
        }
        return null;
    }

    /**
     * 解决办法2
     *
     * @param headA 海达
     * @param headB 头带
     * @return {@link ListNode}
     */
    public ListNode dealMethod2(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;
        //核心思想就是把A 链表和 B 链表连在一起，凑成一个长度一样的链表，
        //这样,两个指针在连接好的链表上就可以同步到达相交点
        while (p1 != p2) {
            if (p1 == null) p1 = headB;
            else p1 = p1.next;
            if (p2 == null) p2 = headA;
            else p2 = p2.next;
        }
        return p1;
    }
}
