package com.tmy.review.day05.num1;

/**
 * 删除有序数组的重复元素(掌握)
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/12
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null){
            return 0;
        }
        int fast = 0 ,slow = 0;
        while (fast < nums.length){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }
}
