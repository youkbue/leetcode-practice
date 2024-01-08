package com.tmy.num23;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 优先级队列测试
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/07
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(4, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //定义一个升序的比较器
                return o1 - o2;
            }
        });
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(2);

        while (!priorityQueue.isEmpty()){
            //数字越小 优先级越高 poll弹出优先级较高的
            System.out.println(priorityQueue.poll());
        }
    }
}
