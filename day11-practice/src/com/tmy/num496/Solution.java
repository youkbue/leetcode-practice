package com.tmy.num496;

import java.util.HashMap;
import java.util.Stack;

/**
 * 给定两个无重复的数组 nums1 是nums2 的子集 ，求nums1中的元素 在nums2中的下一个更大的元素
 * 例如: nums1=[4,3,1] nums2=[1,3,4,2]
 * 输出 [-1,4,3]
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/19
 */
public class Solution {

    int[] nextGreaterElement(int[] nums1 ,int[] nums2){
        //1.先求出nums2的每个元素的下一个更大数
        int[] greaterArray = getGreaterArray(nums2);
        //创建hashMap 将 nums2某个值 和下一个更大数 进行 映射
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i < greaterArray.length ; i++){
            hashMap.put(nums2[i],greaterArray[i]);
        }
        int[] res = new int[nums1.length];
        for (int i = 0 ; i < nums1.length ;i++){
            res[i] = hashMap.get(nums1[i]);
        }
        return res;
    }

    private int[] getGreaterArray(int[] nums){
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = nums.length - 1; i >= 0 ; i--){
            while (!stack.isEmpty() && nums[i] >= stack.peek()){
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return res;
    }
}
