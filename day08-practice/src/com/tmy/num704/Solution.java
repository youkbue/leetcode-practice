package com.tmy.num704;

/**
 * 解决方案
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/16
 */
public class Solution {

    public int search(int[] nums, int target) {
        int left = 0 ,right = nums.length -1;
        while (left <= right){
            int mid = (left + right) /2;
            if(nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target){
                left = mid + 1;
            }
            else if (nums[mid] > right){
                right = right + 1;
            }
        }
        return -1;
    }
}
