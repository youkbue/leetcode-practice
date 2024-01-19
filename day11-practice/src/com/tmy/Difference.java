package com.tmy;

/**
 * 查分数组的工具类
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/19
 */
public class Difference {
    public int[] diff;

    public Difference(int[] nums){
        diff = new int[nums.length];
        diff[0] = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            diff[i] = nums[i] - nums[i - 1];
        }
    }

    public void increment(int left ,int right ,int val){
        diff[left] += val;
        if(right < diff.length){
            diff[right + 1] -= val;
        }
    }

    public int[] getResult(){
        int[] res = new int[diff.length];
        res[0] = diff[0];
        for (int i = 1 ; i < diff.length ;i++){
            res[i] = res[i- 1] + diff[i];
        }
        return res;
    }
}
