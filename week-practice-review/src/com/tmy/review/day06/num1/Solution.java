package com.tmy.review.day06.num1;

/**
 * 删除数组中的指定值(掌握)
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/12
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int fast = 0 ,slow = 0;
        while (fast < nums.length){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
