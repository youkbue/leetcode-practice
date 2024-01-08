package com.tmy.num19;

import com.tmy.ListNode;

/**
 * 删除倒数第n个元素
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/08
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        //删除第一个元素时 防止为空指针
        dummy.next = head;
        //既然要删除第n个元素 我们就找到 倒数第n + 1个元素 改变它的next
        ListNode prefixNode = findReciprocalNode(dummy, n + 1);
        prefixNode.next = prefixNode.next.next;
        return dummy.next;
    }

    /**
     * 返回倒数节点
     *
     * @param head 头
     * @return {@link ListNode}
     */
    private ListNode findReciprocalNode(ListNode head ,int n) {
        //首先 定义一个指针指向该头结点
        ListNode p1 = head;
        //p1 指针先向前走n步
        for (int i = 0 ; i < n ;i++){
            p1 = p1.next;
        }
        //再定义一个指针 指向头结点
        ListNode p2 = head;
        //p1 p2 同时移动 当p1 移动到null指针 即 n-k 步后 p1就停止 同时 p2 也停止
        //这时候p2也走了n-k步，但是走的这一步没有算当前p2的起始位置，而是从起始位置后面一个算起，
        //所以当前所在位置是n-k+1，即倒数第n个位置
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
